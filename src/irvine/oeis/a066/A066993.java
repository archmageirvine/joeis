package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066993 Integer of the form phi(n)*sigma(n)/n.
 * @author Sean A. Irvine
 */
public class A066993 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Jaguar.factor(mN);
        final Z t = fs.sigma().multiply(fs.phi());
        if (t.mod(mN) == 0) {
          return t.divide(mN);
        }
      }
    }
  }
}
