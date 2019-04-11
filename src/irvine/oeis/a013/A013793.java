package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013793 <code>a(n) = 10^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013793 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1000) : mA.multiply(10000);
    return mA;
  }
}
