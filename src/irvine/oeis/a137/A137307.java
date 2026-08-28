package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a053.A053120;

/**
 * A137307 A triangular sequence of coefficients of even plus odd Chebyshev polynomials, A053120: q(x,n) = T(x,2*n-1)+T(x,2*n).
 * @author Sean A. Irvine
 */
public class A137307 extends A053120 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return triangleElement(2 * mN - 1, mM).add(triangleElement(2 * mN, mM));
  }
}

