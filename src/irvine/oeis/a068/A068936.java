package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068936 Numbers having the sum of distinct prime factors not greater than the sum of exponents in prime factorization, A008472(n)&lt;=A001222(n).
 * @author Sean A. Irvine
 */
public class A068936 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sopf().longValueExact() <= fs.bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

