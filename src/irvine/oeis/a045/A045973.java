package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045973 a(1)=10; if n = Product p_i^e_i, n &gt; 1, then a(n) = Product p_{i+1}^e_i * Product p_{i+3}^e_i.
 * @author Sean A. Irvine
 */
public class A045973 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TEN;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(mN);
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      prod = prod.multiply(mPrime.nextPrime(mPrime.nextPrime(q)).multiply(q).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
