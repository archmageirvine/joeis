package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013901 a(n) = 21^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013901 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(194481) : mA.multiply(4084101);
    return mA;
  }
}
