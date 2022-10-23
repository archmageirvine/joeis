package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013775 a(n) = 24^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013775 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(576) : mA.multiply(13824);
    return mA;
  }
}
