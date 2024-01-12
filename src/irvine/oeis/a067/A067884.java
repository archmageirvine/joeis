package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067884 Numbers k such that k = phi(sigma(phi(sigma(phi(sigma(k)))))).
 * @author Sean A. Irvine
 */
public class A067884 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(Jaguar.factor(Euler.phi(Jaguar.factor(Euler.phi(Jaguar.factor(mN).sigma())).sigma())).sigma()).equals(mN)) {
        return mN;
      }
    }
  }
}
