package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016169 a(n) = 7^n - 6^n.
 * @author Sean A. Irvine
 */
public class A016169 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(7);
    mB = mB == null ? Z.ONE : mB.multiply(6);
    return mA.subtract(mB);
  }
}
