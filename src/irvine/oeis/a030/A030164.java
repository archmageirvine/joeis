package irvine.oeis.a030;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030164 Numbers n such that uphi(sigma(n)) = n, where the uphi is the unitary phi function A047994.
 * @author Sean A. Irvine
 */
public class A030164 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).unitaryPhi().equals(mN)) {
        return mN;
      }
    }
  }
}
