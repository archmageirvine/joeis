package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070224 Numbers k such that the sum of p^2, where p are the prime divisors of k, divides the sum of d^2, where d are the divisors of k.
 * @author Sean A. Irvine
 */
public class A070224 extends Sequence1 {

  private long mN = 17;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sp2 = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sp2 = sp2.add(p.square());
      }
      if (fs.sigma2().mod(sp2).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

