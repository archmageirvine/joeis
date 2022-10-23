package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029910 Start with n; if prime, stop; repeatedly sum prime factors (counted with multiplicity) and add 1, until reach 1, 6 or a prime.
 * @author Sean A. Irvine
 */
public class A029910 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    while (!m.isProbablePrime() && !Z.ONE.equals(m) && !Z.SIX.equals(m)) {
      m = Jaguar.factor(m).sopfr().add(1);
    }
    return m;
  }
}
