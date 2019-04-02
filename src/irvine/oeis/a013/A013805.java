package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013805 a(n) = 16^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013805 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(4096) : mA.shiftLeft(16);
    return mA;
  }
}
