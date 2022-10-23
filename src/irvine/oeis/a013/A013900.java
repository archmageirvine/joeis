package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013900 a(n) = 21^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013900 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(9261) : mA.multiply(4084101);
    return mA;
  }
}
