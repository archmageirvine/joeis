package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013733 <code>a(n) = 3^(3n+2)</code>.
 * @author Sean A. Irvine
 */
public class A013733 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(27);
    return mA;
  }
}
