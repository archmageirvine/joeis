package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084767 Number of distinct prime-factors of {2*n-p: 2&lt;p&lt;2*n, p prime}.
 * @author Sean A. Irvine
 */
public class A084767 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final FactorSequence fs = new FactorSequence();
    for (long p = 3; p < mN; p = mPrime.nextPrime(p)) {
      fs.add(mN - p);
    }
    return Z.valueOf(Jaguar.factor(fs).omega());
  }
}
