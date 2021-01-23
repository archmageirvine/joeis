package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000819 E.g.f.: cos(x)^2 / cos(2x) = Sum_{n &gt;= 0} a(n) * x^(2n) / (2n)!.
 * @author Sean A. Irvine
 */
public class A000819 extends A000816 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? Z.ONE : t;
  }
}
