package irvine.oeis.a081;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081378 Numbers k for which the sums of prime factors (ignoring multiplicity) of sigma(k) and phi(k) are equal but the sets of prime factors of sigma and phi are different.
 * @author Sean A. Irvine
 */
public class A081378 extends Sequence1 {

  private long mN = 411;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs1 = Jaguar.factor(Functions.PHI.l(++mN));
      final FactorSequence fs2 = Jaguar.factor(Functions.SIGMA.z(mN));
      if (fs1.sopf().equals(fs2.sopf()) && !Arrays.equals(fs1.toZArray(), fs2.toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}

