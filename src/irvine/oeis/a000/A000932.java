package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000932 a(n) = a(n-1) + n*a(n-2); a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A000932 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
