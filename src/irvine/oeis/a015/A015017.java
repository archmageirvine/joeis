package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015017 q-factorial numbers for q=-4.
 * @author Sean A. Irvine
 */
public class A015017 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-4);
    mA = mA.multiply(mT.subtract(1)).divide(-5);
    return mA;
  }
}
