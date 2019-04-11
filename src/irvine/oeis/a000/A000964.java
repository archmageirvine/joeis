package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000964 The convergent sequence C_n for the ternary continued fraction <code>(3,1</code>;2,2) of period 2.
 * @author Sean A. Irvine
 */
public class A000964 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 0, 1, 1, -3, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 0, -7, 0, 3, 0, -1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
