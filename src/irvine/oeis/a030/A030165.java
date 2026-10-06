package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030165 Numbers m such that uphi(sigma(m)) = 2m, where uphi is the unitary phi function (A047994).
 * @author Sean A. Irvine
 */
public class A030165 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Functions.SIGMA1.z(mN)).unitaryPhi().equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
