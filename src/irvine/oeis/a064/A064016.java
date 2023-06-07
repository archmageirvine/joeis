package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064016 a(n) = Sum_{k &lt;= 10^n} cototient(k), where cototient is A051953.
 * @author Sean A. Irvine
 */
public class A064016 extends A064018 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Z n = Z.valueOf(mN + 1);
    return n.multiply(mN).divide2().subtract(t);
  }
}
