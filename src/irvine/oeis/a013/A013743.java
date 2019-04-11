package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013743 <code>a(n) = 8^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013743 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(9);
    return mA;
  }
}
