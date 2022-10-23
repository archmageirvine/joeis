package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014606 a(n) = (3n)!/(6^n).
 * @author Sean A. Irvine
 */
public class A014606 extends Sequence0 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(++mN).multiply(3 * mN - 2).multiply(3 * mN - 1).divide2();
    return mA;
  }
}
