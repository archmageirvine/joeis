package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013843 a(n) = 7^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013843 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(49) : mA.multiply(16807);
    return mA;
  }
}
