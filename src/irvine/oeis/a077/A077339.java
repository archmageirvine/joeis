package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077339 Triangle in which n-th row contains the first n numbers beginning with n.
 * @author Sean A. Irvine
 */
public class A077339 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mAdd = 0;
  private long mLim = 0;
  private long mA = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mAdd = -1;
      mLim = 10;
      mA = mN * 10;
      return Z.valueOf(mN);
    }
    if (++mAdd == mLim) {
      mLim *= 10;
      mA *= 10;
      mAdd = 0;
    }
    return Z.valueOf(mA + mAdd);
  }
}
