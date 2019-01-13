package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005008.
 * @author Sean A. Irvine
 */
public class A005008 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.compareTo(Z.ONE) > 0) {
      mF = mF.multiply(mN);
    }
    return mF.subtract(mN.square());
  }

}

