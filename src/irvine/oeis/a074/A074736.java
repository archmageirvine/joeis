package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074736 Goedel encoding of the prime factors of n, in increasing order and repeated according to multiplicity.
 * @author Sean A. Irvine
 */
public class A074736 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    Z q = Z.ONE;
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        q = mPrime.nextPrime(q);
        prod = prod.multiply(q.pow(p));
      }
    }
    return prod;
  }
}
