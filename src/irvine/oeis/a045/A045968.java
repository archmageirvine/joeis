package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045968 a(1)=5; for n &gt;= 2, if n = Product p_i^e_i, then a(n) = Product p_{i+3}^e_i.
 * @author Sean A. Irvine
 */
public class A045968 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.FIVE;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(p))).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
