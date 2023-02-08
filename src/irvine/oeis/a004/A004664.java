package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004664 a(n) = n! + n^2.
 * @author Sean A. Irvine
 */
public class A004664 extends Sequence0 {

  private Z mF = Z.ONE;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.signum() > 0) {
      mF = mF.multiply(mN);
    }
    return mF.add(mN.square());
  }
}

