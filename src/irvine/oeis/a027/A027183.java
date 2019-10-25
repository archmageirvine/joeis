package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A027183 <code>a(n) = n-th</code> largest even number in array T given by <code>A027170</code>.
 * @author Sean A. Irvine
 */
public class A027183 extends A027170 {

  private long mRow = 2;
  private Z mLast = Z.ZERO;
  private Z mLeading = t(mRow, 1);
  private final TreeSet<Z> mSet = new TreeSet<>();

  @Override
  public Z next() {
    while (mSet.isEmpty() || mSet.first().compareTo(mLeading) > 0) {
      for (long k = 0; k <= mRow / 2; ++k) {
        final Z t = t(mRow, k);
        if (t.isEven() && t.compareTo(mLast) > 0) {
          mSet.add(t);
        }
      }
      mLeading = t(++mRow, 1);
    }
    mLast = mSet.pollFirst();
    return mLast;
  }
}
