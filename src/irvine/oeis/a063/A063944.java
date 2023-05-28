package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a008.A008904;

/**
 * A063944 Final nonzero digit of (n!)! (A000197).
 * @author Sean A. Irvine
 */
public class A063944 extends A008904 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return digit(mF);
  }
}
