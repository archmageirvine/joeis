package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068935 Numbers having the sum of distinct prime factors less than the sum of exponents in prime factorization, A008472(n) &lt; A001222(n).
 * @author Sean A. Irvine
 */
public class A068935 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sopf().longValueExact() < fs.bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

