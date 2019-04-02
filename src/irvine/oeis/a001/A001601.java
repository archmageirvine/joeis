package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001601 a(n) = 2*a(n-1)^2 - 1, if n&gt;1. a(0)=1, a(1)=3.
 * @author Sean A. Irvine
 */
public class A001601 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA == Z.ONE) {
      mA = Z.THREE;
    } else {
      mA = mA.square().multiply2().subtract(1);
    }
    return mA;
  }
}
