package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a035.A035485;

/**
 * A057984 These numbers are the record number of steps for the numbers in A057983 to reach the top of the deck in Guy's shuffle (see A035485).
 * @author Sean A. Irvine
 */
public class A057984 extends A035485 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private long mN = 1;
  private long mM = -1;

  @Override
  public Z next() {
    while (mSeen.remove(mN)) {
      ++mN;
    }
    while (true) {
      final long first = mDeck.getFirst();
      if (first >= mN) {
        mSeen.add(first);
      }
      if (first == mN) {
        return Z.valueOf(Math.max(0, mM));
      }
      ++mM;
      super.next();
    }
  }
}
