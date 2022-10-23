package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013872 a(n) = 14^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013872 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2744) : mA.multiply(537824);
    return mA;
  }
}
