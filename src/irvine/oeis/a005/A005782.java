package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005782 Number of n-gons in cubic curve.
 * @author Sean A. Irvine
 */
public class A005782 implements Sequence {

  // After Michel Marcus

  private Z chi(final int n) {
    return Z.ONE.shiftLeft(n - 1).add(1).multiply(Z.ONE.shiftLeft(n - 2).subtract(1)).multiply(8);
  }

  private Z phi(final int n) {
    return Z.ONE.shiftLeft(n - 2).add(1).multiply(Z.ONE.shiftLeft(n - 1).subtract(1)).multiply(8);
  }

  private int omega(final int n) {
    return Cheetah.factor(n).omega();
  }

  private Z either(final int n, final int a, final int dsqf) {
    final Z v = (a & 1) == 0 ? chi(a) : phi(a);
    if (a == n) {
      return v;
    }
    if ((omega(dsqf) & 1) == 0) {
      return v;
    }
    return v.negate();
  }

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      if (LongUtils.isSquareFree(d)) {
        sum = sum.add(either(mN, mN / d, d));
      }
    }
    return sum.divide(mN);
  }
}
