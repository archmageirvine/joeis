package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056772 Numbers n such that phi(n+4) = phi(n) + 4.
 * @author Sean A. Irvine
 */
public class A056772 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN + 4).phi().equals(Cheetah.factor(mN).phi().add(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
