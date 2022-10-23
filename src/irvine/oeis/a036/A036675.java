package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036675 G.f. satisfies A(x) = 1 + x*A(x)^2*A(x^2).
 * @author Sean A. Irvine
 */
public class A036675 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mB = null;
  private int mN = -1;

  @Override
  public Z next() {
    mB = mB == null ? RING.one() : RING.add(RING.one(), RING.multiply(RING.pow(mB, 2, mN), mB.substitutePower(2, mN), mN).shift(1));
    return mB.coeff(++mN);
  }
}
