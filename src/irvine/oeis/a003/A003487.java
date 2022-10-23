package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003487 a(n) = a(n-1)^2 - 2.
 * @author Sean A. Irvine
 */
public class A003487 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.square().subtract(2);
    return mA;
  }
}

