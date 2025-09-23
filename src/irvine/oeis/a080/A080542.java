package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080542 In binary representation: keep the first digit and rotate right the others.
 * @author Sean A. Irvine
 */
public class A080542 extends Sequence1 {

  private long mN = 0;
  private long mM = 2;
  private long mS = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.valueOf(mN);
    }
    if (mN >= 2 * mM) {
      mM *= 2;
      ++mS;
    }
    return Z.valueOf(mM | ((mN & (mM - 1)) >>> 1) | ((mN & 1) << mS));
  }
}

