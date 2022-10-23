package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.ContinuedFractionOfSqrtSequence;

/**
 * A059903 Periodic part of continued fraction for sqrt(n), encoded by raising successive primes to the terms. If sqrt(n)=c0+[c1,c2,c3...] then a(n)=2^c1*3^c2*5^c3*...
 * @author Sean A. Irvine
 */
public class A059903 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final ContinuedFractionOfSqrtSequence cf = new ContinuedFractionOfSqrtSequence(1, ++mN);
    Z p = Z.ONE;
    Z res = Z.ONE;
    for (int k = 0; k < cf.getPeriodLength(); ++k) {
      p = mPrime.nextPrime(p);
      res = res.multiply(p.pow(cf.getPeriodElement(k)));
    }
    return res;
  }
}
