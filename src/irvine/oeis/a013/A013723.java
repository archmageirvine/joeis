package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013723 a(n) = 18^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013723 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(18) : mA.multiply(324);
    return mA;
  }
}
