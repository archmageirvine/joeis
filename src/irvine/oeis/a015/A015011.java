package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015011 q-factorial numbers for <code>q=11</code>.
 * @author Sean A. Irvine
 */
public class A015011 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(11);
    mA = mA.multiply(mT.subtract(1)).divide(10);
    return mA;
  }
}
