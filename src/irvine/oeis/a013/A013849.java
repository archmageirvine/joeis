package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013849 a(n) = 8^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013849 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(4096) : mA.shiftLeft(15);
    return mA;
  }
}
