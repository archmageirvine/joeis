package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000804 Permanent of a certain cyclic n X <code>n (0,1)</code> matrix.
 * @author Sean A. Irvine
 */
public class A000804 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(-1, 2, 1, -2, -10, -60, 75, 150, 158, 122, -190, -213, -113, -48, 64, 41);
  private static final Polynomial<Z> DEN = Polynomial.create(-1, 3, 0, -2, -2, -6, 2, 4, 2, 2, -1, -1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

