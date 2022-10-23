package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013755 a(n) = 14^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013755 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(196) : mA.multiply(2744);
    return mA;
  }
}
