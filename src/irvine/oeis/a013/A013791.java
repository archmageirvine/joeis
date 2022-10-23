package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013791 a(n) = 9^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013791 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(729) : mA.multiply(6561);
    return mA;
  }
}
