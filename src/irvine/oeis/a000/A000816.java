package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000816 E.g.f.: <code>Sum_{n &gt;= 0} a(n) * x^(2*n) / (2*n)! =</code> sin(x)^2 / cos(2*x).
 * @author Sean A. Irvine
 */
public class A000816 extends A000364 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2 * mN - 1);
  }
}
