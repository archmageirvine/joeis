package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013822 a(n) = 2^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013822 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(5);
    return mA;
  }
}
