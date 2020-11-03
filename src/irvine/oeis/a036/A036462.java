package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a104.A104320;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A036462 Conjecturally, a power of 2 written in base 3 cannot have this many 0's.
 * @author Sean A. Irvine
 */
public class A036462 extends A104320 {

  // A104321 is better sequence for running a search for this!

  private final TreeSet<Long> mReported = new TreeSet<>();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mZ = 114; // Number of zeros to consider

  @Override
  public Z next() {
    while (true) {
      ++mZ;
      // Heuristic is to wait until we have seen count 10 times higher than target
      while (mSeen.length() < 10 * mZ) {
        final long zeros = super.next().longValueExact();
        if (mReported.contains(zeros)) {
          throw new RuntimeException("Heuristic failure: " + zeros + " is not in the sequence, found with n=" + mN);
        }
        mSeen.set(zeros);
      }
      if (!mSeen.isSet(mZ)) {
        mReported.add(mZ);
        return Z.valueOf(mZ);
      }
    }
  }
}

