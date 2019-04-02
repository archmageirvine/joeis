package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013782 a(n) = 5^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013782 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(625);
    return mA;
  }
}
