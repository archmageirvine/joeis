package irvine.oeis.a058;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000669;

/**
 * A058737 Main diagonal of A058735.
 * @author Sean A. Irvine
 */
public class A058737 extends A000669 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mB.add(super.next());
    return RING.pow(mB, 2, mN).coeff(mN).add(mB.substitutePower(2, mN).coeff(mN)).divide2();
  }
}
