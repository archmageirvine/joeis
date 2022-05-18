package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001869 Number of n-bead necklaces with 5 colors.
 * @author Sean A. Irvine
 */
public class A001869 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      s = s.add(Euler.phi(d).multiply(Z.FIVE.pow(mN / d.intValue())));
    }
    return s.divide(mN);
  }
}
