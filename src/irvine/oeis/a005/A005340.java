package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005340 Number of ways in which n identical balls can be distributed among 7 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Sean A. Irvine
 */
public class A005340 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 6, 6, 1, 0, -66, 74, -21);
  private static final Polynomial<Z> DEN = RING.pow(Polynomial.create(1, -1), 7);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
