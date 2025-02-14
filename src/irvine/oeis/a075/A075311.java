package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075311 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(1);
      if (!mUsed.contains((long) mA.bitCount())) {
        if (mA.bitLength() < Long.SIZE) { // We will run out of memory first
          mUsed.add(mA.longValue());
        }
        return mA;
      }
    }
  }
}
