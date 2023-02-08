package irvine.oeis.a061;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A061300 Least number whose number of divisors is n!.
 * @author Sean A. Irvine
 */
public class A061300 extends A000142 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    if (mN == 4) {
      return Z.valueOf(360); // Special case
    }
    final FactorSequence fs = mFactor.factorize(f);
    final Z[] p = fs.toZArray();
    Z prod = Z.ONE;
    Z q = Z.ONE;
    for (int k = p.length - 1; k >= 0; --k) {
      for (int j = 0; j < fs.getExponent(p[k]); ++j) {
        q = mPrime.nextPrime(q);
        prod = prod.multiply(q.pow(p[k].subtract(1)));
      }
    }
    return prod;
  }
}
