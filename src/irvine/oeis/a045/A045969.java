package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045969 a(1)=6; if n = Product p_i^e_i, n&gt;1, then a(n) = Product p_{i+1}^e_i * Product p_{i+2}^e_i.
 * @author Sean A. Irvine
 */
public class A045969 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.SIX;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(mN);
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      prod = prod.multiply(mPrime.nextPrime(q).multiply(q).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
