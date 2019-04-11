package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007843 Least positive integer k for which <code>2^n</code> divides <code>k!</code>.
 * @author Sean A. Irvine
 */
public class A007843 implements Sequence {

  private long mN = -1;
  private long mM = 1;
  private long mTwoCount = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mTwoCount >= mN) {
        return Z.valueOf(mM);
      }
      long m = ++mM;
      while ((m & 1) == 0) {
        ++mTwoCount;
        m >>>= 1;
      }
    }
  }
}
