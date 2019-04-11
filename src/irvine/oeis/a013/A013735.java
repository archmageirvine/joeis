package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013735 <code>a(n) = 4^(3*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A013735 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(6);
    return mA;
  }
}
