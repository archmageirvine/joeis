package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003961 Completely multiplicative with a(prime(k)) = prime(k+1).
 * @author Sean A. Irvine
 */
public class A003961 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
