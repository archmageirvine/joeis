package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007845 Least positive integer k for which <code>5^n</code> divides k!.
 * @author Sean A. Irvine
 */
public class A007845 implements Sequence {

  private long mN = -1;
  private long mM = 1;
  private long mFiveCount = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mFiveCount >= mN) {
        return Z.valueOf(mM);
      }
      long m = ++mM;
      while (m % 5 == 0) {
        ++mFiveCount;
        m /= 5;
      }
    }
  }
}
