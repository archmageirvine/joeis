package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026999 Uniquification of A026998.
 * @author Sean A. Irvine
 */
public class A026999 extends A026998 {

  {
    setOffset(1);
  }

  private long mRow = 1;
  private Z mLast = Z.ZERO;
  private Z mLeading = get(mRow, 2 * mRow - 2);
  private final TreeSet<Z> mSet = new TreeSet<>();

  @Override
  public Z next() {
    while (mSet.isEmpty() || mSet.first().compareTo(mLeading) > 0) {
      // Need to run through another row
      for (long k = 0; k <= mRow; ++k) {
        final Z t = get(mRow, 2 * k);
        if (t.compareTo(mLast) > 0) {
          mSet.add(t);
        }
      }
      mLeading = get(++mRow, 2 * mRow - 2);
    }
    mLast = mSet.pollFirst();
    return mLast;
  }
}
