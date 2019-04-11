package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013842 <code>a(n) = 7^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013842 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(16807);
    return mA;
  }
}
