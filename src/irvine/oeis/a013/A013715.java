package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013715 a(n) = 10^(2n+1).
 * @author Sean A. Irvine
 */
public class A013715 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(100);
    return mA;
  }
}
