package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053415 Circle numbers (version 3): a(n) = number of points (i,j), i,j integers, contained in a circle of diameter n, centered at (1/2, 1/2).
 * @author Sean A. Irvine
 */
public class A053415 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final int c = ++mN * mN;
    return RING.series(RING.pow(ThetaFunctions.theta2(c).substitutePower(4, new Q(c)).toPolynomial(), 2, c), RING.oneMinusXToTheN(1), c).coeff(c);
  }
}
