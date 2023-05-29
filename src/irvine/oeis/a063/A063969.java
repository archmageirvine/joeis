package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063969 Numbers k such that sopf(k) = sopf(k+3), where sopf(k) = A008472(k).
 * @author Sean A. Irvine
 */
public class A063969 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sopf().equals(Jaguar.factor(mN + 3).sopf())) {
        return Z.valueOf(mN);
      }
    }
  }
}

