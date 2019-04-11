package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002019 <code>a(n) = a(n-1) - (n-1)(n-2)a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A002019 implements Sequence {

  private long mN = -2;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z r = mB.subtract(mA.multiply(mN).multiply(mN - 1));
    mA = mB;
    mB = r;
    return r;
  }
}
