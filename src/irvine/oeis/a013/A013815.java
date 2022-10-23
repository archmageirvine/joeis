package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013815 a(n) = 21^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013815 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(9261) : mA.multiply(194481);
    return mA;
  }
}
