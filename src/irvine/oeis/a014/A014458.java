package irvine.oeis.a014;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014458 Theta series of quadratic form with Gram matrix <code>[ 2, 1, 0</code>; 1, 4, 1; <code>0, 1, 2 ]</code>.
 * @author Sean A. Irvine
 */
public class A014458 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Z> t3 = ThetaFunctions.theta3z(mN);
    return RING.multiply(RING.pow(t3, 2, mN), t3.substitutePower(3, mN), mN).coeff(mN);
  }
}
