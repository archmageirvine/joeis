package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077596 Central coefficients of Moebius polynomials (A074586): coefficient of x^(n/2-1/2) if n is odd; coefficient of x^(n/2-1) if n is even and &gt;4. The n-th Moebius polynomial, M(n,x), satisfies M(n,-1)=mu(n) the Moebius function of n.
 * @author Sean A. Irvine
 */
public class A077596 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.TWO.pow(mN - 1) : mB.get(mN, (mN + 1) / 2);
  }
}
