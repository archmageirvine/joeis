package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062969 Numbers k such that abs(d(k)-k-1) is prime, where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A062969 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().subtract(mN + 1).abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

