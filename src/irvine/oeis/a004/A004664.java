package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004664.
 * @author Sean A. Irvine
 */
public class A004664 implements Sequence {

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

