package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013736 <code>a(n) = 5^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013736 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(125);
    return mA;
  }
}
