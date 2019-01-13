package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002691.
 * @author Sean A. Irvine
 */
public class A002691 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN - 1).multiply(2 * mN - 2).divide(mN - 1);
    }
    return mN == 0 ? Z.ONE : mA.multiply(mN + 2).multiply(2 * mN + 1);
  }
}
