package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001994 Expansion of <code>1/((1-x^2)*(1-x^4)^2*(1-x^6)*(1-x^8)*(1-x^10)) (even</code> powers <code>only)</code>.
 * @author Sean A. Irvine
 */
public class A001994 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 0, -1, 0, -2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, -2, 0, -2, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, -2, 0, -1, 0, 1);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(RING.one(), DEN, mN);
  }
}
