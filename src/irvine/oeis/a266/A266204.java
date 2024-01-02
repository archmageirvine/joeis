package irvine.oeis.a266;

import irvine.math.z.Z;
import irvine.oeis.a056.A056193;

/**
 * A266204 a(n) = G_n(5), where G_n(k) is the Goodstein function defined in A266201.
 * @author Sean A. Irvine
 */
public class A266204 extends A056193 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : code(mA, ++mN).subtract(1);
    return mA;
  }
}
