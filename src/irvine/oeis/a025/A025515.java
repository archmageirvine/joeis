package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022300;

/**
 * A025515 Least k such that first k terms of A022300 contain n more 2's than 1's.
 * @author Sean A. Irvine
 */
public class A025515 extends A022300 {

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
