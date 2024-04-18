package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065604 a(n) = smallest k satisfying the equation phi(k) = phi(k-1) + phi(k-2) and having just n prime factors.
 * @author Sean A. Irvine
 */
public class A065604 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 2;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (fs.bigOmega() == mN) {
        final Z phi = fs.phi();
        final Z phi1 = Functions.PHI.z(k - 1);
        if (phi1.compareTo(phi) < 0 && Functions.PHI.z(k - 2).add(phi1).equals(phi)) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
