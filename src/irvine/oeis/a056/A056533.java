package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A056533 Even sieve: start with natural numbers, remove every 2nd term, remove every 4th term from what remains, remove every 6th term from what remains, etc.
 * @author Sean A. Irvine
 */
public class A056533 implements Sequence {

  private final DynamicIntArray mDownCounts = new DynamicIntArray();
  {
    mDownCounts.set(0, 1); // force array length
  }
  private long mN = 0;
  private int mOutputSoFar = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      for (int k = 1; k < mDownCounts.length(); ++k) {
        final int c = mDownCounts.get(k) - 1;
        if (c == 0) {
          mDownCounts.set(k, 2 * k);
          continue outer;
        }
        mDownCounts.set(k, c);
      }
      if (mOutputSoFar + 1 == 2 * mDownCounts.length()) {
        // Rejected by a new down counter
        mDownCounts.set(mDownCounts.length(), 2 * mDownCounts.length());
        continue;
      }
      ++mOutputSoFar;
      return Z.valueOf(mN);
    }
  }
}
