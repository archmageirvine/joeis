package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a024.A024167;

/**
 * A075827 Let u(1) = x and u(n+1) = (n^2/u(n)) + 1 for n &gt;= 1; then a(n) is such that u(n) =(a(n)*x + b(n))/(c(n)*x + d(n)) (in lowest terms) and a(n), b(n), c(n), d(n) are positive integers.
 * @author Sean A. Irvine
 */
public class A075827 extends A024167 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(mA.gcd(t));
  }
}
