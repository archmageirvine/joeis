package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015018 q-factorial numbers for q=-5.
 * @author Sean A. Irvine
 */
public class A015018 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-5);
    mA = mA.multiply(mT.subtract(1)).divide(-6);
    return mA;
  }
}
