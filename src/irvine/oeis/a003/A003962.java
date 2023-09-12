package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003962 Completely multiplicative with a(prime(k)) = floor( (prime(k+1)+1)/2 ) for k-th prime prime(k).
 * @author Sean A. Irvine
 */
public class A003962 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).add(1).divide2().pow(fs.getExponent(p)));
    }
    return prod;
  }
}
