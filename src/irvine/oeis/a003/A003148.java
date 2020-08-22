package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003148 a(n+1) = a(n) + 2n*(2n+1)*a(n-1), with a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A003148 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.add(mA.multiply(mN - 1).multiply(2 * mN - 1).multiply2());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
