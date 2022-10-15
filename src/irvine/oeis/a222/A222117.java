package irvine.oeis.a222;

import irvine.math.z.Z;
import irvine.oeis.a056.A056193;

/**
 * A222117 Goodstein sequence starting with 15.
 * @author Sean A. Irvine
 */
public class A222117 extends A056193 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : code(mA, ++mN).subtract(1);
    return mA;
  }
}
