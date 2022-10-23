package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013868 a(n) = 13^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013868 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2197) : mA.multiply(371293);
    return mA;
  }
}
