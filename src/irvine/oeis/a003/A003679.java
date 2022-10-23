package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000326;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A003679 Numbers that are not the sum of 3 pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A003679 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final List<Long> mPentagonals = new ArrayList<>();
  private final A000326 mPentagonalSource = new A000326();
  private long mLastPentagonal = -1;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mLastPentagonal) {
        mLastPentagonal = mPentagonalSource.next().longValueExact();
        mPentagonals.add(mLastPentagonal);
        for (final long a : mPentagonals) {
          final long t = a + mLastPentagonal;
          for (final long b : mPentagonals) {
            mSeen.set(t + b);
          }
        }
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
