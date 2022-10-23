package irvine.oeis.a034;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034295 Number of different ways to divide an n X n square into sub-squares, considering only the list of parts.
 * @author Sean A. Irvine
 */
public class A034295 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final HashMap<String, Set<Polynomial<Z>>> mCache = new HashMap<>();
  private int mN = 0;

  private Set<Polynomial<Z>> computeB(final long n, final long[] l) {
    if (LongUtils.max(l) > n) {
      return Collections.emptySet();
    } else if (n == 0) {
      return Collections.singleton(RING.zero());
    } else {
      final long t = LongUtils.min(l);
      if (t > 0) {
        final long[] tl = new long[l.length];
        for (int k = 0; k < l.length; ++k) {
          tl[k] = l[k] - t;
        }
        return b(n - t, tl);
      } else {
        int k = 0;
        while (l[k] > 0) {
          ++k;
        }
        final HashSet<Polynomial<Z>> s = new HashSet<>();
        for (int i = k; i < l.length && l[i] == 0; ++i) {
            final long[] nl = Arrays.copyOf(l, l.length);
            for (int j = k; j <= i; ++j) {
              nl[j] = 1L + i - k;
            }
            for (final Polynomial<Z> p : b(n, nl)) {
              s.add(RING.add(p, RING.monomial(Z.ONE, 1 + i - k)));
            }
        }
        return s;
      }
    }
  }

  private Set<Polynomial<Z>> b(final long n, final long[] l) {
    final String key = n + Arrays.toString(l);
    final Set<Polynomial<Z>> res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Set<Polynomial<Z>> b = computeB(n, l);
    mCache.put(key, b);
    return b;
  }

  @Override
  public Z next() {
    return Z.valueOf(b(++mN, new long[mN]).size());
  }
}
