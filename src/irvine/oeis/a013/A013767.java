package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013767 a(n) = 20^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013767 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(400) : mA.multiply(8000);
    return mA;
  }
}
