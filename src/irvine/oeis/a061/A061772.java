package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061772 a(n) is the number of n-digit multiples of n.
 * @author Sean A. Irvine
 */
public class A061772 extends Sequence1 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.TEN;
    }
    mA = mA.multiply(10);
    return mA.multiply(10).divide(++mN).subtract(mA.divide(mN));
  }
}
