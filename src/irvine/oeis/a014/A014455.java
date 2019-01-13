package irvine.oeis.a014;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014455.
 * @author Sean A. Irvine
 */
public class A014455 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> t3 = ThetaFunctions.theta3z(++mN);
    return RING.multiply(RING.pow(t3, 2, mN), t3.substitutePower(2, mN), mN).coeff(mN);
  }
}
