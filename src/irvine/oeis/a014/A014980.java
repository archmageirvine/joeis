package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014980 a(n+1) = floor(a(n)/2) * ceiling(a(n)/2), a(0) = 5.
 * @author Sean A. Irvine
 */
public class A014980 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.divide2().multiply(mA.add(1).divide2());
    return mA;
  }
}
