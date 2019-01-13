package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;

import irvine.util.Pair;

import java.util.HashSet;

/**
 * A002219.
 * @author Sean A. Irvine
 */
public class A002219 implements Sequence {

  private long mN = 0;

  private final HashMap<Pair<Long, Long>, Z> mG = new HashMap<>();

  private Z g(final long n, final long i) {
    if (n == 0) {
      return Z.ONE;
    }
    final Pair<Long, Long> key = new Pair<>(n, i);
    final Z r = mG.get(key);
    if (r != null) {
      return r;
    }
    Z s = i > 1 ? g(n, i - 1) : Z.ZERO;
    if (i <= n) {
      s = s.add(g(n - i, i));
    }
    mG.put(key, s);
    return s;
  }

  private Z b(final long n, final long i, final Set<Long> s) {
    if ((i == 1 && !s.isEmpty()) || s.contains(n)) {
      return g(n, i);
    }
    if (i < 1 || s.isEmpty()) {
      return Z.ZERO;
    }
    Z sum = b(n, i - 1, s);
    if (i <= n) {
      final HashSet<Long> newSet = new HashSet<>();
      for (final long x : s) {
        if (x <= n - i) {
          newSet.add(Math.max(x, n - i - x));
        }
        if (x >= i && x <= n) {
          newSet.add(Math.max(x - i, n - x));
        }
      }
      sum = sum.add(b(n - i, i, newSet));
    }
    return sum;
  }


  @Override
  public Z next() {
    ++mN;
    return b(2 * mN, mN, Collections.singleton(mN));
  }
}
