package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013734 <code>a(n) = 4^(3*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A013734 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(6);
    return mA;
  }
}
