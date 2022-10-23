package irvine.oeis.a014;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014110 Number of ordered ways of writing n as a sum of 4 squares of natural numbers.
 * @author Sean A. Irvine
 */
public class A014110 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.pow(RING.add(RING.one(), ThetaFunctions.theta3z(++mN)), 4, mN).coeff(mN).divide(16);
  }
}
