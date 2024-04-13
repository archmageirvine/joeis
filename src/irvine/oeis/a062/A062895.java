package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062895 Numbers k for which d(k) = d(R(k)), where R(k) is the reversal of k and d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A062895 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().equals(Jaguar.factor(Functions.REVERSE.l(mN)).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

