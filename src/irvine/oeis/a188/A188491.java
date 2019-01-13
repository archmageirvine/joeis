package irvine.oeis.a188;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.IntegerField;

/**
 * A188491.
 * @author Sean A. Irvine
 */
public class A188491 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 1, 1, -1, -3, -3, -1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -3, -3, -13, -21, -19, -3, 7, 9, 5, 3, 3, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
