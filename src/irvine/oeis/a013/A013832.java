package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013832 <code>a(n) = 4^(5*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013832 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(10);
    return mA;
  }
}
