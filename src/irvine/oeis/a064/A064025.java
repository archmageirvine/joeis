package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A064025 Length of period of the continued fraction for sqrt(n!).
 * @author Sean A. Irvine
 */
public class A064025 extends A003285 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return period(mF);
  }
}
