package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048691 a(n) = d(n^2), where d(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A048691 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = new FactorSequence();
    fs.add(++mN, FactorSequence.UNKNOWN, 2);
    Jaguar.factor(fs);
    return fs.sigma0();
  }
}

