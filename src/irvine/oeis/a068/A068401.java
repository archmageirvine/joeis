package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068401 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().equals(Euler.phi(mN - 1).add(Euler.phi(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
