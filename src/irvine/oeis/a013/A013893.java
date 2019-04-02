package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013893 a(n) = 19^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013893 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(130321) : mA.multiply(2476099);
    return mA;
  }
}
