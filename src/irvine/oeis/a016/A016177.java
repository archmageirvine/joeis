package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016177 <code>a(n) = 8^n - 7^n</code>.
 * @author Sean A. Irvine
 */
public class A016177 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    mB = mB == null ? Z.ONE : mB.multiply(7);
    return mA.subtract(mB);
  }
}
