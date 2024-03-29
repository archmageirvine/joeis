package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013855 a(n) = 10^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013855 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(100) : mA.multiply(100000);
    return mA;
  }
}
