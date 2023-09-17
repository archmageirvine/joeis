package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065824 Smallest solution m to (n+1)*phi(m) = n*sigma(m), or -1 if no solution exists.
 * @author Sean A. Irvine
 */
public class A065824 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      m += 2;
      final FactorSequence fs = Jaguar.factor(m);
      if (fs.phi().multiply(mN + 1).equals(fs.sigma().multiply(mN))) {
        return Z.valueOf(m);
      }
    }
  }
}

