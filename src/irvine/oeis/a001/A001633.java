package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001633 Numbers with an odd number of digits.
 * @author Sean A. Irvine
 */
public class A001633 extends Sequence1 {

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
