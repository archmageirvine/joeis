package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013784 <code>a(n) = 6^(4*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013784 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(1296);
    return mA;
  }
}
