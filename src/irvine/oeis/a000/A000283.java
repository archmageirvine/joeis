package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000283 a(n) = a(n-1)^2 + a(n-2)^2 for n &gt;= 2 with a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A000283 extends Sequence0 {

  private boolean mN = true;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (mN) {
      mN = false;
      return Z.ZERO;
    }
    final Z t = mA.square().add(mB.square());
    mA = mB;
    mB = t;
    return t;
  }
}
