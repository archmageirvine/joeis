package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A048868 Numbers for which reduced residue system contains more primes than nonprimes.
 * @author Sean A. Irvine
 */
public class A048868 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (super.next().subtract(fs.omega()).multiply2().compareTo(fs.phi()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
