package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054520 Let S = {1,5,9,13,..., 4n+1, ...} and call p in S an S-prime if p&gt;1 and the only divisors of p in S are 1 and p; sequence gives elements of S that are not S-primes.
 * @author Sean A. Irvine
 */
public class A054520 extends Sequence1 {

  private long mN = -3;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      final FactorSequence fs = Jaguar.factor(mN);
      long sum = 0;
      for (final Z p : fs.toZArray()) {
        sum += fs.getExponent(p) * (p.mod(4) == 3 ? 1L : 2L);
        if (sum > 2) {
          break;
        }
      }
      if (sum != 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

