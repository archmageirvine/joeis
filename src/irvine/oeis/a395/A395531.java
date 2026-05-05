package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A395531 allocated for Christian Perfect.
 * @author Sean A. Irvine
 */
public class A395531 extends Sequence1 {

  private final DynamicLongArray mPositions = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      mPositions.set(0, 1);
      return Z.ONE;
    }
    while (true) {
      ++mN;
      // Can we start a new row?
      if (mPositions.get(mPositions.length() - 1) >= mN) {
        mPositions.set(mPositions.length(), mN);
        return Z.valueOf(mN);
      }
      // Otherwise place in an earlier row
      for (int k = mPositions.length() - 1; k >= 0; --k) {
        if (k == 0 || mPositions.get(k) + mN <= mPositions.get(k - 1)) {
          mPositions.add(k, mN);
          break;
        }
      }
    }
  }
}
