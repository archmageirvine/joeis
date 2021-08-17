package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050622 Numbers m that are divisible by 2^k, where k is the digit length of m.
 * @author Sean A. Irvine
 */
public class A050622 implements Sequence {

  // After Robert Israel

  private int mN = 1;
  private long mLim = 5;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM == mLim) {
      mM = (mLim + 1) / 2;
      mLim *= 5;
      ++mN;
    }
    return Z.valueOf(mM).shiftLeft(mN);
  }
}
