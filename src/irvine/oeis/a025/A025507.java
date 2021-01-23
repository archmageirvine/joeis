package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a006.A006928;

/**
 * A025507 Least k such that the first k terms of A006928 contain n more 2's than 1's.
 * @author Sean A. Irvine
 */
public class A025507 extends A006928 {

  private long mRunningDelta = 0;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mRunningDelta != mN) {
      mRunningDelta += super.next().longValue() * 2 - 3;
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
