package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056775 Numbers k such that phi(k+12) = phi(k) + 12.
 * @author Sean A. Irvine
 */
public class A056775 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN + 12).phi().equals(Cheetah.factor(mN).phi().add(12))) {
        return Z.valueOf(mN);
      }
    }
  }
}
