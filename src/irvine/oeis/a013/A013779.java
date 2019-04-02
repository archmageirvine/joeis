package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013779 a(n) = 3^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013779 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(27) : mA.multiply(81);
    return mA;
  }
}
