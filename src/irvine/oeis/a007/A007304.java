package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007304 Sphenic numbers: products of 3 distinct primes.
 * @author Sean A. Irvine
 */
public class A007304 implements Sequence {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() == 3 && fs.omega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
