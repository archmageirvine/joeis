package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000122 Expansion of Jacobi theta function theta_3(x) = Sum_{m =-oo..oo} x^(m^2) (number of integer solutions to k^2 = n).
 * @author Sean A. Irvine
 */
public class A000122 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE;
    }
    if (mN.sqrtAndRemainder()[1].isZero()) {
      return Z.TWO;
    }
    return Z.ZERO;
  }
}

