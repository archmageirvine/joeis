package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013770 <code>a(n) = 22^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013770 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.multiply(10648);
    return mA;
  }
}
