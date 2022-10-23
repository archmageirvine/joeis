package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013800 a(n) = 14^(4*n+1).
 * @author Sean A. Irvine
 */
public class A013800 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14) : mA.multiply(38416);
    return mA;
  }
}
