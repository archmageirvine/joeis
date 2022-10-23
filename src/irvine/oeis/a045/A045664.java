package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045664 Number of 2n-bead balanced binary strings of fundamental period 2n, rotationally equivalent to reversed complement.
 * @author Sean A. Irvine
 */
public class A045664 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.ONE.shiftLeft(d - 1).multiply(Mobius.mobius(mN / d)));
    }
    return sum.multiply(2 * mN);
  }
}

