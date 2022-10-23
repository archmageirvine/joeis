package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053596 Open 3-dimensional ball numbers (version 4): a(n) is the number of integer points (i,j,k) contained in an open ball of diameter n, centered at (1/2, 1/2, 1/2).
 * @author Sean A. Irvine
 */
public class A053596 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final int c = ++mN * mN;
    return RING.series(RING.pow(ThetaFunctions.theta2(c).substitutePower(4, new Q(c)).toPolynomial(), 3, c), RING.oneMinusXToTheN(1), c).coeff(c);
  }
}
