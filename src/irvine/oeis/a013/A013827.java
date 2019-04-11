package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013827 <code>a(n) = 3^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013827 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(243);
    return mA;
  }
}
