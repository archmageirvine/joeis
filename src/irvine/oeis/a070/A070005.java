package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070005 Arithmetic mean of prime factors of n is an integer and n is neither a prime nor power of a prime.
 * @author Sean A. Irvine
 */
public class A070005 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final int omega = fs.omega();
      if (omega > 1 && fs.sopf().mod(omega) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
