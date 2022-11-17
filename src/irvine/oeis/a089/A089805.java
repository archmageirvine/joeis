package irvine.oeis.a089;

import irvine.math.z.Z;

/**
 * A089805 Expansion of Jacobi theta function (theta_4(q^6) - theta_4(q^(2/3)))/2/q^(2/3).
 * @author Georg Fischer
 */
public class A089805 extends A089801 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(2*n)=A089801(n). a(2*n+1)=0.
    ++mN;
    return ((mN & 1) == 0) ? (((mN & 2) == 0) ? super.next() : super.next().negate()) : Z.ZERO;
  }
}
