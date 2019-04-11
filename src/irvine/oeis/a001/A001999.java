package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001999 <code>a(n) = a(n-1)*(a(n-1)^2 - 3)</code>.
 * @author Sean A. Irvine
 */
public class A001999 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      mA = mA.square().subtract(3).multiply(mA);
    }
    return mA;
  }
}
