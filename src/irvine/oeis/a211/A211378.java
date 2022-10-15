package irvine.oeis.a211;

import irvine.math.z.Z;
import irvine.oeis.a056.A056193;

/**
 * A211378 Goodstein sequence starting with 19.
 * @author Sean A. Irvine
 */
public class A211378 extends A056193 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : code(mA, ++mN).subtract(1);
    return mA;
  }
}
