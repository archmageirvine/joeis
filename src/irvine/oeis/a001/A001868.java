package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001868 Number of n-bead necklaces with 4 colors.
 * @author Sean A. Irvine
 */
public class A001868 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      s = s.add(Euler.phi(d).shiftLeft(2 * (mN / d.intValue())));
    }
    return s.divide(mN);
  }
}
