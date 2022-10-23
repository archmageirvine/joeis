package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029908 Starting with n, repeatedly sum prime factors (with multiplicity) until reaching 0 or a fixed point. Then a(n) is the fixed point (or 0).
 * @author Sean A. Irvine
 */
public class A029908 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z prev;
    do {
      prev = m;
      m = Jaguar.factor(m).sopfr();
    } while (!m.isZero() && !prev.equals(m));
    return m;
  }
}
