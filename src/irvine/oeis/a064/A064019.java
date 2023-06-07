package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064019 Numbers k such that sopf(k) = sopf(k^2 - 1), where sopf(k) = A008472(k).
 * @author Sean A. Irvine
 */
public class A064019 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sopf().equals(Jaguar.factor(mN * mN - 1).sopf())) {
        return Z.valueOf(mN);
      }
    }
  }
}
