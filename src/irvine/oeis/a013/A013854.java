package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013854 a(n) = 10^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013854 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(100000);
    return mA;
  }
}
