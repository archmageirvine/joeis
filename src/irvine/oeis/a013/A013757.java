package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013757 a(n) = 15^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013757 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(225) : mA.multiply(3375);
    return mA;
  }
}
