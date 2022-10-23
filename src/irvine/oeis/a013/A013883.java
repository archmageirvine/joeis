package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013883 a(n) = 17^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013883 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(289) : mA.multiply(1419857);
    return mA;
  }
}
