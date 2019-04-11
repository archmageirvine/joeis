package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013714 <code>a(n) = 9^(2*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013714 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(81);
    return mA;
  }
}
