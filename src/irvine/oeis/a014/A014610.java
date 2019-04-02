package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014610 Tetranacci numbers arising in connection with current algebras sp(2)_n.
 * @author Sean A. Irvine
 */
public class A014610 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(3, 2, 2, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, -1, -1);

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
