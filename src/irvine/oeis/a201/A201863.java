package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.a076.A076626;

/**
 * A201863 Let CZ(0,x)=1, CZ(1,x)=0 , CZ(2,x)=x^2-1 and CZ(n,x)=2*x*CZ(n-1,x) - CZ(n-2,x) for n &gt; 2. This sequence is the triangle of polynomial coefficients in order of decreasing exponents.
 * @author Sean A. Irvine
 */
public class A201863 extends A076626 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN - mM);
  }
}
