package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A029909 Starting with each nonprime number (A018252), repeatedly sum prime factors (with multiplicity) until reaching 0 or a fixed point. Then a(n) is the fixed point (or 0).
 * @author Sean A. Irvine
 */
public class A029909 extends A018252 {

  @Override
  public Z next() {
    Z m = super.next();
    Z prev;
    do {
      prev = m;
      m = Functions.SOPFR.z(m);
    } while (!m.isZero() && !prev.equals(m));
    return m;
  }
}
