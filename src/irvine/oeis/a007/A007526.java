package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007526 <code>a(n) = n(a(n-1) + 1), a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A007526 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(1).multiply(mN);
    }
    return mA;
  }
}
