package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013828 a(n) = 3^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013828 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(27) : mA.multiply(243);
    return mA;
  }
}
