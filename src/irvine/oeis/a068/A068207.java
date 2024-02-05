package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068207 Numbers k such that the number of divisors of k^2-1 equals the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A068207 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().equals(Jaguar.factor(mN * mN - 1).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
