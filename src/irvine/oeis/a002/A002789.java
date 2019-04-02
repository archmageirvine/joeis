package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002789 Number of integer points in a certain quadrilateral scaled by a factor of n.
 * @author Sean A. Irvine
 */
public class A002789 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 2, 2, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 1, 1, -1);

  int mN = 0;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
