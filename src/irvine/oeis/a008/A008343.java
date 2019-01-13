package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008343.
 * @author Sean A. Irvine
 */
public class A008343 implements Sequence {

  private Z mA = Z.ONE;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.signum() > 0) {
      mA = mA.signedAdd(mA.compareTo(mN) < 0, mN);
    }
    return mA;
  }
}


