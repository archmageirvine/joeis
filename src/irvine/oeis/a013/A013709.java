package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013709 a(n) = 4^(2n+1).
 * @author Sean A. Irvine
 */
public class A013709 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(4);
    return mA;
  }
}
