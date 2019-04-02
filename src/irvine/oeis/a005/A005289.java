package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005289 Number of graphs on n nodes with 3 cliques.
 * @author Sean A. Irvine
 */
public class A005289 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 1, 1, 3).shift(2);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -3, 1, 4, -2, -2, -2, 4, 1, -3, 1);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(NUM, DEN, mN);
  }
}
