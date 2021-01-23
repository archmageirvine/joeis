package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A027936 Uniquification of array T given by A027935.
 * @author Sean A. Irvine
 */
public class A027936 extends A027935 {

  private long mRow = 1;
  private Z mLast = Z.ZERO;
  private Z mLeading = A027926.t(mRow, 2 * mRow - 2);
  private final TreeSet<Z> mSet = new TreeSet<>();

  @Override
  public Z next() {
    while (mSet.isEmpty() || mSet.first().compareTo(mLeading) > 0) {
      // Need to run through another row
      for (long k = 0; k <= mRow; ++k) {
        final Z t = A027926.t(mRow, 2 * k);
        if (t.compareTo(mLast) > 0) {
          mSet.add(t);
        }
      }
      mLeading = A027926.t(++mRow, 2 * mRow - 2);
    }
    mLast = mSet.pollFirst();
    return mLast;
  }
}
