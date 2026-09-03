package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086435 Maximum number of parts possible in a factorization of n into a product of distinct numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A086435 extends Sequence1 {

  // After Max Alekseyev

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private Z a(final Z n, final Z m) {
    if (n.compareTo(m) > 0) {
      Z max = Z.ZERO;
      for (final Z d : Jaguar.factor(n).divisors()) {
        if (d.compareTo(m) > 0) {
          max = max.max(a(n.divide(d), d));
        }
      }
      return max.add(1);
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    Z q = Z.TWO;
    long c = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e > 1) {
        ++c;
        prod = prod.multiply(q.pow(e));
        q = mPrime.nextPrime(q);
      }
    }
    return a(prod, Z.ONE).add(fs.omega() - c);
  }
}

