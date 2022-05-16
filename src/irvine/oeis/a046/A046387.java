package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046387 Products of 5 distinct primes.
 * @author Sean A. Irvine
 */
public class A046387 implements Sequence {

  private long mN = 2309;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() == 5 && fs.omega() == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
