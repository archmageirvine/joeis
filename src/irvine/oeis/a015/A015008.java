package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015008 q-factorial numbers for q=9.
 * @author Sean A. Irvine
 */
public class A015008 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(9);
    mA = mA.multiply(mT.subtract(1)).divide(8);
    return mA;
  }
}
