package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013729 <code>a(n) = 24^(2*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013729 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(576);
    return mA;
  }
}
