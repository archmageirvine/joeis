package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000919 <code>a(n) = 4^n -</code> C(4,3)*3^n + C(4,2)*2^n - C(4,1).
 * @author Sean A. Irvine
 */
public class A000919 extends A000453 {

  private int mN = 3;

  @Override
  public Z next() {
    if (mN > 0) {
      --mN;
      return Z.ZERO;
    }
    return super.next().multiply(24);
  }
}
