package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015004 q-factorial numbers for <code>q=5</code>.
 * @author Sean A. Irvine
 */
public class A015004 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(5);
    mA = mA.multiply(mT.subtract(1)).divide(4);
    return mA;
  }
}
