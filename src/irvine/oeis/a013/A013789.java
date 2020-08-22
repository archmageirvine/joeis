package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013789 a(n) = 8^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013789 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(512) : mA.shiftLeft(12);
    return mA;
  }
}
