package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002714 Number of different keys with n cuts, depths between 1 and 7 and depth difference at most 1 between adjacent cut depths.
 * @author Sean A. Irvine
 */
public class A002714 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 3, -7, -5, 2);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -4, 2, 4, -1);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
