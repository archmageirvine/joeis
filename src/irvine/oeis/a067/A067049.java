package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067049 Triangle T(n,r) = lcm(n,n-1,n-2,...,n-r+1)/lcm(1,2,3,...,r-1,r), 0 &lt;= r &lt; n.
 * @author Sean A. Irvine
 */
public class A067049 extends Sequence1 {

  private int mN = -1;
  private int mM = 0;
  private Z mDen = Z.ONE;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mDen = Z.ONE;
    }
    Z num = Z.ONE;
    if (mM >= 1) {
      mDen = mDen.lcm(Z.valueOf(mM));
      for (long k = Math.max(1, mN - mM + 1); k <= mN; ++k) {
        num = num.lcm(Z.valueOf(k));
      }
    }
    return num.divide(mDen);
  }
}
