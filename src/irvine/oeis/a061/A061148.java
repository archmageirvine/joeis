package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061148 Smallest positive integer for which the number of divisors is a product of 2 distinct primes: Min{x; d[x]=pq}.
 * @author Sean A. Irvine
 */
public class A061148 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] f = fs.toZArray();
      if (f.length == 2 && fs.getExponent(f[0]) == 1 && fs.getExponent(f[1]) == 1) {
        return Z.THREE.pow(f[0].intValueExact() - 1).shiftLeft(f[1].intValueExact() - 1);
      }
    }
  }
}
