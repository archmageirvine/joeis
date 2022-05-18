package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003962 Completely multiplicative with a(p(k)) = floor( (p(k+1)+1)/2 ) for k-th prime p(k).
 * @author Sean A. Irvine
 */
public class A003962 implements Sequence {

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
