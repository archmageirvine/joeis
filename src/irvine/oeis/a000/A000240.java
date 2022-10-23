package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000240 Rencontres numbers: number of permutations of [n] with exactly one fixed point.
 * @author Sean A. Irvine
 */
public class A000240 extends Sequence1 {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mPrev = mPrev.multiply(mN).add((mN & 1) == 0 ? -mN : mN);
    return mPrev;
  }
}

