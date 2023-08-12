package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065061 Numbers k such that sigma(k) - tau(k) is a prime.
 * @author Sean A. Irvine
 */
public class A065061 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final long r = ++mN % 10;
      if (r != 4 && r != 6) {
        final FactorSequence fs = Jaguar.factor(mN);
        if (fs.sigma().subtract(fs.sigma0()).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

