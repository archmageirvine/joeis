package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013839 a(n) = 6^(5n+2).
 * @author Sean A. Irvine
 */
public class A013839 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(36) : mA.multiply(7776);
    return mA;
  }
}
