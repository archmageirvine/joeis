package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001637 Numbers with an even number of digits.
 * @author Sean A. Irvine
 */
public class A001637 extends Sequence1 {

  private long mN = 9;
  private long mNextSkip = 100;

  @Override
  public Z next() {
    if (++mN == mNextSkip) {
      mN *= 10;
      mNextSkip *= 100;
    }
    return Z.valueOf(mN);
  }
}
