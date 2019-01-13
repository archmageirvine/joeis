package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001584.
 * @author Sean A. Irvine
 */
public class A001584 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 0, 0, -2, 0, 0, 1, 0, -1);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 1, 1, -1, -1, -1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
