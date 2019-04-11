package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013822 <code>a(n) = 2^(5*n + 1)</code>.
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
