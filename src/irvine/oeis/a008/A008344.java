package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008344.
 * @author Sean A. Irvine
 */
public class A008344 implements Sequence {

  private Z mA = Z.ZERO;
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


