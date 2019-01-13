package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002727.
 * @author Sean A. Irvine
 */
public class A002727 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 0, 1, 2, 1, 0, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -4, 4, 2, -2, -4, -3, 12, -3, -4, -2, 2, 4, -4, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
