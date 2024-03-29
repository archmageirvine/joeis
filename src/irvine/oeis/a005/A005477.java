package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005477 a(n) = 2^(n-1)*(2^n - 1)*Product_{j=1..n-1} (2^j + 1).
 * @author Sean A. Irvine
 */
public class A005477 extends Sequence0 {

  private int mN = -1;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mP = mP.multiply(Z.ONE.shiftLeft(mN - 1).add(1));
    }
    return mP.multiply(Z.ONE.shiftLeft(mN).subtract(1)).shiftLeft(mN - 1);
  }
}
