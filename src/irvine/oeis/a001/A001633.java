package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001633.
 * @author Sean A. Irvine
 */
public class A001633 implements Sequence {

  private long mN = -1;
  private long mNextSkip = 10;

  @Override
  public Z next() {
    if (++mN == mNextSkip) {
      mN *= 10;
      mNextSkip *= 100;
    }
    return Z.valueOf(mN);
  }
}
