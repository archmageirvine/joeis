package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058376 Where the race of the count of final nonzero digit of k! changes, starting at k=2.
 * @author Sean A. Irvine
 */
public class A058376 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 1;
  private long mMax = 0;
  private int mD = 0;
  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      while (true) {
        final int r = (int) mF.mod(10);
        if (r == 0) {
          mF = mF.divide(10);
        } else {
          if (++mCounts[r] > mMax) {
            mMax = mCounts[r];
            if (r != mD) {
              mD = r;
              return Z.valueOf(mN);
            }
          }
          break;
        }
      }
    }
  }
}

