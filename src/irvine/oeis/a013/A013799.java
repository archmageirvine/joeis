package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013799 a(n) = 13^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013799 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2197) : mA.multiply(28561);
    return mA;
  }
}
