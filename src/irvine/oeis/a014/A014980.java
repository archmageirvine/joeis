package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014980 a(n+1) = floor(a(n)/2) * ceiling(a(n)/2), a(0) = 5.
 * @author Sean A. Irvine
 */
public class A014980 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.divide2().multiply(mA.add(1).divide2());
    return mA;
  }
}
