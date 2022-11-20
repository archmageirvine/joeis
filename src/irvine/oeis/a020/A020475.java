package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007012;

/**
 * A020475 a(n) is the number of k for which C(n,k) is divisible by n.
 * @author Sean A. Irvine
 */
public class A020475 extends A007012 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(super.next());
  }
}
