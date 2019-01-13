package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016185.
 * @author Sean A. Irvine
 */
public class A016185 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9);
    mB = mB == null ? Z.ONE : mB.multiply(8);
    return mA.subtract(mB);
  }
}
