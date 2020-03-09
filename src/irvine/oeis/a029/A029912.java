package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029912 Start with n; repeatedly sum prime factors (counted with multiplicity) and add 1, until reach <code>1, 6</code> or a prime.
 * @author Sean A. Irvine
 */
public class A029912 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    do {
      m = Cheetah.factor(m).sopfr().add(1);
    } while (!m.isProbablePrime() && !Z.ONE.equals(m) && !Z.SIX.equals(m));
    return m;
  }
}
