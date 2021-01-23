package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004033 Theta series of lattice A_2 tensor E_8 (dimension 16, det. 6561, min. norm 4). Also theta series of Eisenstein version of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A004033 implements Sequence {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z48 = Z.valueOf(48);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta3 = eta.substitutePower(3, mN);
    final Polynomial<Z> eta9 = eta.substitutePower(9, mN);
    final Polynomial<Z> a = RING.series(RING.add(RING.pow(eta, 3, mN), RING.multiply(RING.pow(eta9, 3, mN).shift(1), Z.NINE)), eta3, mN);
    final Polynomial<Z> gf = RING.multiply(RING.pow(a, 2, mN),
      RING.subtract(RING.pow(a, 6, mN),
        RING.multiply(RING.multiply(RING.pow(eta, 6, mN), RING.pow(eta3, 6, mN)).shift(1), Z48)));
    return gf.coeff(mN);
  }
}
