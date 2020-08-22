package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013820 a(n) = 24^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013820 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(331776);
    return mA;
  }
}
