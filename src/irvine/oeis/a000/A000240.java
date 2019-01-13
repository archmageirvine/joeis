package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000240.
 * @author Sean A. Irvine
 */
public class A000240 implements Sequence {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mPrev = mPrev.multiply(mN).add((mN & 1) == 0 ? -mN : mN);
    return mPrev;
  }
}

