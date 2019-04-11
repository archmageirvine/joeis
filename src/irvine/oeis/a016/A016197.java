package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016197 <code>a(n) = 12^n - 11^n</code>.
 * @author Sean A. Irvine
 */
public class A016197 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    mB = mB == null ? Z.ONE : mB.multiply(11);
    return mA.subtract(mB);
  }
}
