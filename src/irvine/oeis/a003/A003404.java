package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003404.
 * @author Sean A. Irvine
 */
public class A003404 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 0, 2, 2, 3, 3, 5, 4, 8, 4, 5, 3, 3, 2, 2, 0, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 0, 1, 0, 1, 0, 1, 0, -1, -2, -1, 0, -1, 1, 1, 2, 1, 1, -1, 0, -1, -2, -1, 0, 1, 0, 1, 0, 1, 0, 0, -1, -1, 1);
  private int mN = -1;


  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
