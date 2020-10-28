package irvine.oeis.a033;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a027.A027307;

/**
 * A033296 Number of paths from (0,0) to (3n,0) that stay in first quadrant (but may touch horizontal axis), where each step is (2,1),(1,2) or (1,-1) and start with (1,2).
 * @author Sean A. Irvine
 */
public class A033296 extends A027307 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.pow(mA, 3, ++mN).coeff(mN);
  }
}

