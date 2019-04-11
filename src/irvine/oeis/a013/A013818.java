package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013818 <code>a(n) = 23^(4*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013818 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(279841);
    return mA;
  }
}
