package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013769 a(n) = 21^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013769 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(441) : mA.multiply(9261);
    return mA;
  }
}
