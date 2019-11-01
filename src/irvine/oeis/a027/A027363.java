package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027363 Generalizing the 27 lines on a cubic surface: number of lines on the generic hypersurface of degree <code>2n-1</code> in complex projective <code>(n+1)-space</code>.
 * @author Sean A. Irvine
 */
public class A027363 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int j = 0; j <= 2 * mN - 1; ++j) {
      p = RING.multiply(p, Polynomial.create(2 * mN - 1 - j, j), mN);
    }
    return RING.multiply(p, C, mN).coeff(mN);
  }
}
