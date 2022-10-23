package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013862 a(n) = 12^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013862 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(248832);
    return mA;
  }
}
