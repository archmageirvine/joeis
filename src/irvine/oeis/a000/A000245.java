package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000245.
 * @author Sean A. Irvine
 */
public class A000245 implements Sequence {

  private long mN = -1;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mP = Z.ONE;
    } else if (mN > 0) {
      mP = mP.multiply2().multiply(2 * mN - 1).multiply(mN)
        .divide(mN - 1).divide(mN + 2);
    }
    return mP;
  }
}

