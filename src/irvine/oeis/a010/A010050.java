package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010050 a(n) = (2n)!.
 * @author Sean A. Irvine
 */
public class A010050 extends Sequence0 {

  private long mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return mF;
  }
}

