package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013803 a(n) = 15^(4*n+3).
 * @author Sean A. Irvine
 */
public class A013803 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(3375) : mA.multiply(50625);
    return mA;
  }
}
