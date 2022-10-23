package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A036463 Conjecturally, a power of 2 written in base 3 cannot have this many 2's.
 * @author Sean A. Irvine
 */
public class A036463 extends Sequence1 {

  private final TreeSet<Long> mReported = new TreeSet<>();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mZ = 41; // Number of zeros to consider
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mZ;
      // Heuristic is to wait until we have seen count 10 times higher than target
      while (mSeen.length() < 10 * mZ) {
        final long twos = ZUtils.digitCounts(Z.ONE.shiftLeft(++mN), 3)[2];
        if (mReported.contains(twos)) {
          throw new RuntimeException("Heuristic failure: " + twos + " is not in the sequence, found with n=" + mN);
        }
        mSeen.set(twos);
      }
      if (!mSeen.isSet(mZ)) {
        mReported.add(mZ);
        return Z.valueOf(mZ);
      }
    }
  }
}

