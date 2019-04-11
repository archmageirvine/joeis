package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002000 <code>a(n+1) = a(n)*(a(n)^2 - 3)</code> with <code>a(0) = 7</code>.
 * @author Sean A. Irvine
 */
public class A002000 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
    } else {
      mA = mA.square().subtract(3).multiply(mA);
    }
    return mA;
  }
}
