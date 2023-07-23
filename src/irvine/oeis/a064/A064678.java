package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064678 Numbers k such that sopf(k) = sopfr(k+1), where sopf(k) = A008472(k) and sopfr(k) = A001414(k).
 * @author Sean A. Irvine
 */
public class A064678 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sopf().equals(Jaguar.factor(mN + 1).sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
