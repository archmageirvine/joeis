package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067234 Numbers n such that phi(4n+1) = sigma(n).
 * @author Sean A. Irvine
 */
public class A067234 extends Sequence1 {

  private long mN = 55;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().equals(Euler.phi(4 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
