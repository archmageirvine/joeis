package irvine.oeis.a005;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005608 Number of Boolean functions realized by cascades of n gates.
 * @author Sean A. Irvine
 */
public class A005608 implements Sequence {

  private final HashMap<String, Z> mButlerSCache = new HashMap<>();

  protected Z computeButlerS1(final int i, final long s, final long r) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= i; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(i, k).multiply(Z.valueOf(i - k).pow(s * r)));
    }
    return sum.multiply(Binomial.binomial(s, i));
  }

  private Z computeButlerS(final int i, final int s, final int r, final int n) {
    if (n == 0) {
      return Z.TWO;
    }
    if (n == 1) {
      return computeButlerS1(i, s, r);
    } else {
      Z sum = Z.ZERO;
      for (int j = 1; j <= s; ++j) {
        Z t = Z.ZERO;
        for (int k = 0; k < i; ++k) {
          t = t.signedAdd((k & 1) == 0, Binomial.binomial(i, k).multiply(Binomial.binomial(Z.valueOf(i - k).pow(r).longValueExact(), j)));
        }
        t = t.multiply(Binomial.binomial(s, i));
        sum = sum.add(t.multiply(butlerS(j, s, r, n - 1)).divide(Binomial.binomial(s, j)));
      }
      return sum;
    }
  }

  protected Z butlerS(final int i, final int s, final int r, final int n) {
    final String key = i + "," + s + "," + r + "," + n;
    final Z res = mButlerSCache.get(key);
    if (res != null) {
      return res;
    }
    final Z t = computeButlerS(i, s, r, n);
    mButlerSCache.put(key, t);
    return t;
  }

  protected Z butlerN(final int n, final int s, final int r) {
    Z sum = Z.ZERO;
    for (int i = 1; i <= s; ++i) {
      sum = sum.add(butlerS(i, s, r, n));
    }
    return sum;
  }

  private int mN = 0;

  @Override
  public Z next() {
    return butlerN(++mN, 3, 2);
  }
}

