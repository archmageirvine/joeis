package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013778 <code>a(n) = 3^(4*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013778 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(81);
    return mA;
  }
}
