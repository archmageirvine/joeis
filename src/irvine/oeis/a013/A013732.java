package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013732 <code>a(n) = 3^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013732 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(27);
    return mA;
  }
}
