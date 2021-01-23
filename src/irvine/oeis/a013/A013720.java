package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013720 a(n) = 15^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013720 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.multiply(225);
    return mA;
  }
}
