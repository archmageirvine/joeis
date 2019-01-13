package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137866.
 * @author Sean A. Irvine
 */
public class A137866 implements Sequence {

  private long mN = 0;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mPrev = mPrev.add(1).gcd(Z.valueOf(mN));
    }
    return mPrev;
  }
}

