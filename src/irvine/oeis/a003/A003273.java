package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a006.A006991;

/**
 * A003273 Congruent numbers: positive integers n for which there exists a right triangle having area n and rational sides.
 * @author Sean A. Irvine
 */
public class A003273 extends A006991 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private final List<Z> mA6991 = new ArrayList<>();
  private long mMaxSquare = 1;
  private Z mMaxSquareValue = Z.ONE;

  @Override
  public Z next() {
    while (mPriority.isEmpty() || mPriority.first().compareTo(mA6991.get(mA6991.size() - 1)) > 0) {
      // Read a new square-free solution for A006991
      final Z n = super.next();
      mA6991.add(n);
      for (long s = 1; s <= mMaxSquare; ++s) {
        mPriority.add(n.multiply(s).multiply(s));
      }
    }
    while (mPriority.first().compareTo(mMaxSquareValue) > 0) {
      // Update the square parts
      ++mMaxSquare;
      mMaxSquareValue = Z.valueOf(mMaxSquare).square();
      for (final Z a : mA6991) {
        mPriority.add(a.multiply(mMaxSquareValue));
      }
    }
    return mPriority.pollFirst();
  }

}
