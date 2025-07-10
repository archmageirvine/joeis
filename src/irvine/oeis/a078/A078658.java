package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078658 a(0) = 1; for n&gt;0, a(n) = 1 + coefficient of x^n in expansion of 1/Product_{ n &gt;= 2, n not of the form 2^k-1 } (1-x^n).
 * @author Sean A. Irvine
 */
public class A078658 extends A078657 {

  @Override
  public Z next() {
    return super.next().add(mN > 0 ? 1 : 0);
  }
}
