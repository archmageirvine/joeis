package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013768 a(n) = 21^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013768 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(21) : mA.multiply(9261);
    return mA;
  }
}
