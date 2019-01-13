package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015028.
 * @author Sean A. Irvine
 */
public class A015028 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-13);
    mA = mA.multiply(mT.subtract(1)).divide(-14);
    return mA;
  }
}
