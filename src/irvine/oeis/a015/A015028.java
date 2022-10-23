package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015028 q-factorial numbers for q=-13.
 * @author Sean A. Irvine
 */
public class A015028 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-13);
    mA = mA.multiply(mT.subtract(1)).divide(-14);
    return mA;
  }
}
