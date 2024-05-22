package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067883 Numbers k such that k = phi(sigma(phi(sigma(k)))).
 * @author Sean A. Irvine
 */
public class A067883 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.PHI.z(Functions.SIGMA1.z(Functions.PHI.z(Jaguar.factor(mN).sigma()))).equals(mN)) {
        return mN;
      }
    }
  }
}
