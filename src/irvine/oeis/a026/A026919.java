package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026919 Uniquification of A026907.
 * @author Sean A. Irvine
 */
public class A026919 extends A026907 {

  private long mRow = 0;
  private Z mLeading = t(mRow, 0);
  private final TreeSet<Z> mSet = new TreeSet<>();

  @Override
  public Z next() {
    if (mSet.isEmpty() || mSet.first().compareTo(mLeading) > 0) {
      // Need to run through another row
      for (long k = 0; k <= mRow; ++k) {
        mSet.add(t(mRow, k));
      }
      mLeading = t(++mRow, 0);
    }
    return mSet.pollFirst();
  }
}
