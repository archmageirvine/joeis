package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.IntegerField;

/**
 * A002529.
 * @author Sean A. Irvine
 */
public class A002529 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 0, -2, -2, -2, 2, 2);
  private static final Polynomial<Z> DEN = Polynomial.create(-1, 2, 2, 0, 10, 8, -2, -16, -10, -2, 4, 2, 0, 2, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
