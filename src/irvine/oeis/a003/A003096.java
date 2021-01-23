package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003096 a(n) = a(n-1)^2 - 1.
 * @author Sean A. Irvine
 */
public class A003096 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.square().subtract(1);
    return mA;
  }
}
