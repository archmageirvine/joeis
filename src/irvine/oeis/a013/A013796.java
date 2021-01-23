package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013796 a(n) = 12^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013796 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(20736);
    return mA;
  }
}
