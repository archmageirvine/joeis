package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045971 a(1)=8; if n = Product p_i^e_i, n &gt; 1, then a(n) = Product p_{i+1}^{e_i+2}.
 * @author Sean A. Irvine
 */
public class A045971 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.EIGHT;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).pow(fs.getExponent(p) + 2));
    }
    return prod;
  }
}
