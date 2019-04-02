package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013823 a(n) = 2^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013823 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(5);
    return mA;
  }
}
