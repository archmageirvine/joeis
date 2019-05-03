package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015015 q-factorial numbers for <code>q=-3</code>.
 * @author Sean A. Irvine
 */
public class A015015 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-3);
    mA = mA.multiply(mT.subtract(1)).divide(-4);
    return mA;
  }
}
