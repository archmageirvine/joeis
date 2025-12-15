package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A390507 a(n) = number of 1's in A390505(n).
 * @author Sean A. Irvine
 */
public class A390507 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(0, 1);
  private int[] mA = {};

  @Override
  public Z next() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
    }
    long ones = 0;
    int c = 1;
    for (int k = 1; k < mA.length; ++k) {
      if (mA[k] != mA[k - 1]) {
        ones += Long.bitCount(c) + Long.bitCount(mA[k - 1]);
        c = 1;
      } else {
        ++c;
      }
    }
    ones += Long.bitCount(c) + Long.bitCount(mA[mA.length - 1]);
    return Z.valueOf(ones);
  }
}
