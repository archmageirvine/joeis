package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013796 a(n) = 12^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013796 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(20736);
    return mA;
  }
}
