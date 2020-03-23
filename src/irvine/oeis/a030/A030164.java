package irvine.oeis.a030;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030164 Numbers n such that <code>uphi(sigma(n)) =</code> n, where the uphi is the unitary phi function <code>A047994</code>.
 * @author Sean A. Irvine
 */
public class A030164 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Cheetah.factor(mN).sigma()).unitaryPhi().equals(mN)) {
        return mN;
      }
    }
  }
}
