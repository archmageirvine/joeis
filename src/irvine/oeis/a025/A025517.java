package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a022.A022303;

/**
 * A025517 Least k such that first k terms of A022303 contain n more 1's than 2's.
 * @author Sean A. Irvine
 */
public class A025517 extends A022303 {

  private long mRunningDelta = 0;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mRunningDelta != mN) {
      mRunningDelta -= super.next().longValue() * 2 - 3;
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
