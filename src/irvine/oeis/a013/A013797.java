package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013797 a(n) = 12^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013797 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1728) : mA.multiply(20736);
    return mA;
  }
}
