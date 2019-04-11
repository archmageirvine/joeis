package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013740 <code>a(n) = 7^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013740 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(343);
    return mA;
  }
}
