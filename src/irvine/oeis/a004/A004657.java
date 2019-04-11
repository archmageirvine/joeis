package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004657 Expansion of g.f.: <code>(1+x^3)*(1+x^4)/((1-x)*(1-x^2)^2*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A004657 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, -1, 1, 0, 1, -1, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -2, 0, 2, -2, 2, 0, -2, 1);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

