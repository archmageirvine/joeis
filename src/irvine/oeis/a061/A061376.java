package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061376 a(n) = f(n) + f(f(n)) where f(n) = 0 if n &lt;= 1 or a prime, otherwise f(n) = sum of distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A061376 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private long f(final long n) {
    if (n <= 1 || mPrime.isPrime(n)) {
      return 0;
    }
    return Functions.SUM.z(Jaguar.factor(n).toZArray()).longValueExact();
  }

  @Override
  public Z next() {
    final long f = f(++mN);
    return Z.valueOf(f + f(f));
  }
}

