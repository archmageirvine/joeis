package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053732 Number of ways to partition {1,...,n} into arithmetic progressions of length &gt;= 1.
 * @author Sean A. Irvine
 */
public class A053732 extends Sequence0 {

  private int mN = -1;
  private int[] mValue;
  private int[] mDeltas;
  private long mCount;

  private void search(final int free, final int next) {
    if (next > mN) {
      ++mCount;
      return;
    }
    // Place "next" in all possible ways
    for (int k = 0; k < free; ++k) {
      if (mDeltas[k] == 0) {
        mDeltas[k] = next - mValue[k];
        mValue[k] += mDeltas[k];
        search(free, next + 1);
        mValue[k] -= mDeltas[k];
        mDeltas[k] = 0;
      } else if (mValue[k] + mDeltas[k] == next) {
        mValue[k] += mDeltas[k];
        search(free, next + 1);
        mValue[k] -= mDeltas[k];
      }
    }
    mValue[free] = next;
    search(free + 1, next + 1);
  }

  @Override
  public Z next() {
    ++mN;
    mValue = new int[mN];
    mDeltas = new int[mN];
    mCount = 0;
    search(0, 1);
    return Z.valueOf(mCount);
  }
}
