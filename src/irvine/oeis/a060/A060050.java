package irvine.oeis.a060;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A060050 Number of irreducible nonpositively curved triangulations of an n-gon: All internal vertices have at valence at least 6 and no diagonals of the n-gon are allowed.
 * @author Sean A. Irvine
 */
public class A060050 extends A060049 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;
  {
    super.next();
    mA.add(super.next());
    mB.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    mB.add(RING.subtract(RING.subtract(mA, RING.x()), RING.substitute(mB, mA.shift(0), mN)).coeff(mN));
    return mB.coeff(mN);
  }
}
