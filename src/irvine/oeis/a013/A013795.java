package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013795 a(n) = 11^(4*n+3).
 * @author Sean A. Irvine
 */
public class A013795 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1331) : mA.multiply(14641);
    return mA;
  }
}
