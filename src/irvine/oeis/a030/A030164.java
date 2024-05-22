package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030164 Numbers n such that uphi(sigma(n)) = n, where the uphi is the unitary phi function A047994.
 * @author Sean A. Irvine
 */
public class A030164 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Functions.SIGMA1.z(mN)).unitaryPhi().equals(mN)) {
        return mN;
      }
    }
  }
}
