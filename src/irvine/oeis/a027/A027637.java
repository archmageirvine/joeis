package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027637 a(n) = Product_{i=1..n} (4^i - 1).
 * @author Sean A. Irvine
 */
public class A027637 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(2 * mN).subtract(1));
    }
    return mA;
  }
}
