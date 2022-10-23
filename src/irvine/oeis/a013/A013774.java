package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013774 a(n) = 24^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013774 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(13824);
    return mA;
  }
}
