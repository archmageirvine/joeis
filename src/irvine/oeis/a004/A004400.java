package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004400.
 * @author Sean A. Irvine
 */
public class A004400 implements Sequence {

  private Z mF = Z.ONE;
  private Z mSum = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(2 * mN);
    }
    if (mN >= 0) {
      mSum = mSum.add(mF);
    }
    return mSum;
  }
}

