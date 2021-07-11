package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A048867 Numbers for which reduced residue system contains fewer primes than nonprimes.
 * @author Sean A. Irvine
 */
public class A048867 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (super.next().subtract(fs.omega()).multiply2().compareTo(fs.phi()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
