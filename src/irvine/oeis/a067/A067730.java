package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067730 Numbers n such that sigma(n-1) + sigma(n+1) = sigma(2n).
 * @author Sean A. Irvine
 */
public class A067730 extends Sequence1 {

  private long mN = 308;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(mN++).sigma().add(Jaguar.factor(mN + 1).sigma()).equals(Jaguar.factor(2 * mN).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
