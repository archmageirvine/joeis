package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028928 Theta series of quadratic form (or lattice) with Gram matrix [ 3, 1; 1, 5 ].
 * @author Sean A. Irvine
 */
public class A028928 implements Sequence {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long t = mN;
    while (t % 7 == 0) {
      t /= 7;
    }
    final int kronecker = LongUtils.kronecker(-7, t);
    if (kronecker != -1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      sum = sum.add(LongUtils.kronecker(-14, dd.longValue()));
    }
    return sum;
  }
}

