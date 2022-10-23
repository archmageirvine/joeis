package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036758 Number of edge-rooted tree-like octagonal systems.
 * @author Sean A. Irvine
 */
public class A036758 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  Polynomial<Z> mG = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mG = RING.add(RING.add(RING.add(RING.one(), RING.multiply(mG, Z.FIVE)),
      RING.multiply(RING.pow(mG, 2, mN), Z.SIX)),
      RING.pow(mG, 3, mN)).shift(1);
    return mG.coeff(mN);
  }
}
