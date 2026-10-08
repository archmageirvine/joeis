package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A140056 Triangle of coefficients: f(x,y,n) = x^n - y^(n-1)*x - y^n; p(x,y,z,n) = f(x,y,n) + f(y,z,n) + f(z,x,n).
 * @author Sean A. Irvine
 */
public class A140056 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mN + (mN < 2 ? 1 : 0)) {
      ++mN;
      mM = 0;
    }
    if (mN == 0) {
      return Z.valueOf(-3);
    }
    if (mM == 0) {
      return mN == 1 ? Z.valueOf(-2) : Z.NEG_ONE;
    }
    if (mM == 1) {
      return mN == 2 ? Z.valueOf(-2) : Z.NEG_ONE;
    }
    if (mM == mN - 1) {
      return Z.NEG_ONE;
    }
    return Z.ZERO;
  }
}
