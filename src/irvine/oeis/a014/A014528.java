package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014528 Neither == 0 (mod 4) nor a power of 3.
 * @author Sean A. Irvine
 */
public class A014528 implements Sequence {

  private long mN = 0;
  private long mNextPowerOfThree = 3;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mNextPowerOfThree) {
        mNextPowerOfThree *= 3;
        continue;
      }
      if ((mN & 3) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
