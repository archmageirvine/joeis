package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014608 a(n) = (4n)!/(24^n).
 * @author Sean A. Irvine
 */
public class A014608 extends Sequence0 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(++mN).multiply(4 * mN - 3).multiply(4 * mN - 1).multiply(2 * mN - 1).divide(3);
    return mA;
  }
}
