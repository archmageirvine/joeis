package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A134885 Triangle reads by rows: T(n,k) = [x^k] p(n,x) where p(0,x)=1, p(1,x)=137-x, and p(n,x)=(-1)^(n-1)*(137-n) + (-1)^(n-1)*137*x^(n-1) - (-1)^(n-1)*x^n.
 * @author Sean A. Irvine
 */
public class A134885 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    if (mM == 0) {
      if (mN == 1) {
        return Z.valueOf(137);
      }
      return Z.NEG_ONE.pow(mN - 1).multiply(137 - mN);
    }
    if (mM == mN - 1) {
      return Z.NEG_ONE.pow(mN - 1).multiply(137);
    }
    if (mM == mN) {
      return Z.NEG_ONE.pow(mN);
    }
    return Z.ZERO;
  }
}
