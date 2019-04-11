package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013781 <code>a(n) = 4^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013781 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(8);
    return mA;
  }
}
