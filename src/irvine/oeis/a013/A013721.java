package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013721 a(n) = 16^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013721 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(8);
    return mA;
  }
}
