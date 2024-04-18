package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
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
      if (Functions.PHI.z(Functions.SIGMA.z(Functions.PHI.z(Jaguar.factor(Functions.PHI.z(Jaguar.factor(mN).sigma())).sigma()))).equals(mN)) {
        return mN;
      }
    }
  }
}
