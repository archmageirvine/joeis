package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007844 Least positive integer k for which 3^n divides k!.
 * @author Sean A. Irvine
 */
public class A007844 implements Sequence {

  private long mN = -1;
  private long mM = 1;
  private long mThreeCount = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mThreeCount >= mN) {
        return Z.valueOf(mM);
      }
      long m = ++mM;
      while (m % 3 == 0) {
        ++mThreeCount;
        m /= 3;
      }
    }
  }
}
