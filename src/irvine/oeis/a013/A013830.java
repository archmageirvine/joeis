package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013830 <code>a(n) = 4^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013830 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(10);
    return mA;
  }
}
