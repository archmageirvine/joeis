package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054873 Number of (S_5 67)-avoiding permutations.
 * @author Sean A. Irvine
 */
public class A054873 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(0, 1, 2, 6, 24, 480, -2160);
  private static final Polynomial<Z> S = Polynomial.create(0, -16, 36);
  private int mN = 0;

  @Override
  public Z next() {
    return C.coeff(++mN).subtract(RING.sqrt1p(S, mN).shift(5).coeff(mN).multiply(360));
  }
}
