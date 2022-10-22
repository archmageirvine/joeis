package irvine.oeis.a060;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a059.A059710;

/**
 * A060049 Triangulations of an n-gon such that each internal vertex has valence at least 6, i.e., nonpositively curved triangulations.
 * @author Sean A. Irvine
 */
public class A060049 extends A059710 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;
  {
    mB.add(Z.ONE);
  }

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    if (mN > 0) {
      mB.add(RING.subtract(mA, RING.substitute(mB, mA.shift(1), mN)).coeff(mN));
    }
    return mB.coeff(mN);
  }
}
