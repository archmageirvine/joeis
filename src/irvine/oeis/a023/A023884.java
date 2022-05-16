package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023884 Average of divisors except itself is an integer.
 * @author Sean A. Irvine
 */
public class A023884 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(mN).mod(fs.sigma0().subtract(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

