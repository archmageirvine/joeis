package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001869 Number of n-bead necklaces with 5 colors.
 * @author Sean A. Irvine
 */
public class A001869 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      s = s.add(Functions.PHI.z(d).multiply(Z.FIVE.pow(mN / d.intValue())));
    }
    return s.divide(mN);
  }
}
