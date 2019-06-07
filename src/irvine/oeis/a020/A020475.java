package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a007.A007012;

/**
 * A020475 <code>a(n)</code> is number of k for which <code>C(n,k)</code> is divisible by <code>n</code>.
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
