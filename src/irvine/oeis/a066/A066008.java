package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066008 Number of n-digit positive integers m for which m/(sum of digits of m) is an integer, sometimes referred to as Niven or Harshad numbers.
 * @author Sean A. Irvine
 */
public class A066008 extends Sequence1 {

  private long mN = 1;
  private long mLim = 1;

  @Override
  public Z next() {
    mLim *= 10;
    long cnt = 0;
    while (mN < mLim) {
      if (mN % ZUtils.digitSum(mN) == 0) {
        ++cnt;
      }
      ++mN;
    }
    return Z.valueOf(cnt);
  }
}
