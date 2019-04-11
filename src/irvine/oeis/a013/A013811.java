package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013811 <code>a(n) = 19^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013811 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(6859) : mA.multiply(130321);
    return mA;
  }
}
