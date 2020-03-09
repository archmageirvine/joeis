package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A029911 Start with n; if prime, skip; repeatedly sum prime factors (counted with multiplicity) and add 1, until reach <code>1, 6</code> or a prime.
 * @author Sean A. Irvine
 */
public class A029911 extends A018252 {

  @Override
  public Z next() {
    Z m = super.next();
    while (!m.isProbablePrime() && !Z.ONE.equals(m) && !Z.SIX.equals(m)) {
      m = Cheetah.factor(m).sopfr().add(1);
    }
    return m;
  }
}
