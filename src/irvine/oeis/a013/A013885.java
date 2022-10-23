package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013885 a(n) = 17^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013885 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(83521) : mA.multiply(1419857);
    return mA;
  }
}
