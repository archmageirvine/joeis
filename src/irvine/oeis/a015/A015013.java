package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015013 q-factorial numbers for q=-2.
 * @author Sean A. Irvine
 */
public class A015013 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-2);
    mA = mA.multiply(mT.subtract(1)).divide(-3);
    return mA;
  }
}
