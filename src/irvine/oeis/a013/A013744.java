package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013744 <code>a(n) = 9^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013744 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(729);
    return mA;
  }
}
