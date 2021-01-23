package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013831 a(n) = 4^(5n+2).
 * @author Sean A. Irvine
 */
public class A013831 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(10);
    return mA;
  }
}
