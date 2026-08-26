package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136673 Triangle of coefficients from a polynomial recursion for Galois field GF(2^n) polynomials: p(x,n)=(x+1)*p(x,n-1)-x*p(x,n-2); or f(x,n)=x^n+x+1;.
 * @author Sean A. Irvine
 */
public class A136673 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (mN == 0 && mM == 1) {
        return Z.ONE;
      }
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return mN == 0 ? Z.TWO : Z.ONE;
    }
    if (mM == 1) {
      return mN == 1 ? Z.TWO : Z.ONE;
    }
    if (mM == mN) {
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
