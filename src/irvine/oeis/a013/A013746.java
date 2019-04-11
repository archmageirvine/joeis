package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013746 <code>a(n) = 10^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013746 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(1000);
    return mA;
  }
}
