package irvine.oeis.a027;

import java.util.Collections;

import irvine.factor.factor.Cheetah;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A027364 Coefficients of unique normalized cusp form Delta_16 of weight 16 for full modular group.
 * @author Sean A. Irvine
 */
public class A027364 extends A000594 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mS = RING.one();
  private final Polynomial<Z> mEta24 = RING.create(Collections.emptyList());
  private int mN = 0;

  @Override
  public Z next() {
    mEta24.add(super.next());
    mS.add(Cheetah.factor(++mN).sigma(3).multiply(240));
    return RING.multiply(mS, mEta24, mN).shift(1).coeff(mN);
  }
}
