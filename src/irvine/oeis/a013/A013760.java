package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013760 a(n) = 17^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013760 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : mA.multiply(4913);
    return mA;
  }
}
