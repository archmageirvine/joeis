package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013801 a(n) = 14^(4*n+3).
 * @author Sean A. Irvine
 */
public class A013801 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2744) : mA.multiply(38416);
    return mA;
  }
}
