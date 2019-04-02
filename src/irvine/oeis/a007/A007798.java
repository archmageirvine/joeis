package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007798 Expected number of random moves in Tower of Hanoi problem with n disks starting with a randomly chosen position and ending at a position with all disks on the same peg.
 * @author Sean A. Irvine
 */
public class A007798 implements Sequence {

  private Z mFives = null;
  private Z mThrees = Z.TWO;

  @Override
  public Z next() {
    if (mFives == null) {
      mFives = Z.ONE;
    } else {
      mFives = mFives.multiply(5);
      mThrees = mThrees.multiply(3);
    }
    return mFives.subtract(mThrees).add(1).divide(4);
  }
}
