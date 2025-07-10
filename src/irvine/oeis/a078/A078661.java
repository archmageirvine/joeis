package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078661 a(0) = 1; for n&gt;0, a(n) = 1 + coefficient of x^n in expansion of Product_{ n &gt;= 2, n not of the form 2^k-1 } (1+x^n).
 * @author Sean A. Irvine
 */
public class A078661 extends A078660 {

  @Override
  public Z next() {
    return super.next().add(mN > 0 ? 1 : 0);
  }
}
