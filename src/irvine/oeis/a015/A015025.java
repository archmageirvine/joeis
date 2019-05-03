package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015025 q-factorial numbers for <code>q=-10</code>.
 * @author Sean A. Irvine
 */
public class A015025 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-10);
    mA = mA.multiply(mT.subtract(1)).divide(-11);
    return mA;
  }
}
