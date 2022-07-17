package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a035.A035485;

/**
 * A057983 These numbers take a record number of steps to reach the top of the deck in Guy's shuffle (see A035485).
 * @author Sean A. Irvine
 */
public class A057983 extends A035485 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private long mN = 1;

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
        return Z.valueOf(mN);
      }
      super.next();
    }
  }
}
