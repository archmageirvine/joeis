package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013761 <code>a(n) = 17^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013761 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(289) : mA.multiply(4913);
    return mA;
  }
}
