package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010035 a(n) = 2*3^(2*n)-3^n.
 * @author Sean A. Irvine
 */
public class A010035 extends Sequence0 {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply(9);
      mB = mB.multiply(3);
    }
    return mA.subtract(mB);
  }
}
