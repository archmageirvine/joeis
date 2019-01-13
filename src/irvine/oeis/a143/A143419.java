package irvine.oeis.a143;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A143419.
 * @author Sean A. Irvine
 */
public class A143419 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 1, 0, -1, -2, -3, -3, -2, 0, 2, 4, 5, 4, 2, 0, -2, -3, -3, -2, -1, 0, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), DEN, ++mN);
  }
}
