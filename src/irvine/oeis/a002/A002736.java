package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A002736 Ap\u00e9ry numbers: a(n) = n^2*C(2n,n).
 * @author Sean A. Irvine
 */
public class A002736 extends A000108 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mN * mN).multiply(mN + 1);
  }
}
