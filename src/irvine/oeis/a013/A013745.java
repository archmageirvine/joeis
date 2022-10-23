package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013745 a(n) = 9^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013745 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(81) : mA.multiply(729);
    return mA;
  }
}
