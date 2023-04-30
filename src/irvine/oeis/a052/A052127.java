package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052127 Sum_{n &gt;= 0} a(n) * x^n / n!^2 = exp(-2*x)/(1-x)^3.
 * @author Sean A. Irvine
 */
public class A052127 extends A052124 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
