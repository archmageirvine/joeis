package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013878 <code>a(n) = 16^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013878 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(20);
    return mA;
  }
}
