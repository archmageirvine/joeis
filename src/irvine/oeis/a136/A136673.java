package irvine.oeis.a136;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136673 Triangle T(n,k) read by rows: T(n,k) = [x^k] x^n+x+1, 0 &lt;= k &lt;= max(n, 1).
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
