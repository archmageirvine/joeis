package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013871 a(n) = 14^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013871 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(196) : mA.multiply(537824);
    return mA;
  }
}
