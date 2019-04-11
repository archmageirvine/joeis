package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013825 <code>a(n) = 2^(5*n + 4)</code>.
 * @author Sean A. Irvine
 */
public class A013825 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(5);
    return mA;
  }
}
