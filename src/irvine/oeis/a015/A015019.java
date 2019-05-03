package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015019 q-factorial numbers for <code>q=-6</code>.
 * @author Sean A. Irvine
 */
public class A015019 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-6);
    mA = mA.multiply(mT.subtract(1)).divide(-7);
    return mA;
  }
}
