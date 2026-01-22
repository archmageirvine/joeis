package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035513;

/**
 * A083398 Number of diagonals needed to produce a list {1,..n} in the Wythoff array.
 * @author Sean A. Irvine
 */
public class A083398 extends Sequence1 {

  private final Sequence mWythoff = new A035513();
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mLeastUnseen = 1;
  private long mRows = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mLeastUnseen <= mN) {
      ++mRows;
      for (long k = 0; k < mRows; ++k) {
        mSeen.add(mWythoff.next().longValueExact());
      }
      while (mSeen.remove(mLeastUnseen)) {
        ++mLeastUnseen;
      }
    }
    return Z.valueOf(mRows);
  }
}
