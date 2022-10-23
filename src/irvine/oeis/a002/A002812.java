package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002812 a(n) = 2*a(n-1)^2 - 1, starting a(0)=2.
 * @author Sean A. Irvine
 */
public class A002812 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.square().multiply2().subtract(1);
    }
    return mA;
  }
}

