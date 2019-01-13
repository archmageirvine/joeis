package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161661.
 * @author Sean A. Irvine
 */
public class A161661 implements Sequence {

  private long mPrev = 1;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long sigma0 = Cheetah.factor(mPrev).sigma0();
      mPrev = sigma0 * ((mN + sigma0 - 1) / sigma0);
    }
    return Z.valueOf(mPrev);
  }
}

