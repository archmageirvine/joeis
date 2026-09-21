package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086596 An invariant of the set {log(2), log(3), log(5),..., log(prime(2n)), log(prime(2n+1))}.
 * @author Sean A. Irvine
 */
public class A086596 extends Sequence1 {

  private long mN = 1;
  private long mSum = 0;
  private Z mPrimorial = null;

  // Effectively iterate over the divisors <= sqrt(primorial(n)) of primorial(n) keeping track of the mobius value
  private void search(final int k, final Z prod, final int mobius) {
    if (k == mN) {
      mSum += mobius;
      return;
    }
    final long p = Functions.PRIME.l(k + 1);
    final Z pr = prod.multiply(p * p);
    if (pr.compareTo(mPrimorial) <= 0) {
      search(k + 1, pr, -mobius);
      search(k + 1, prod, mobius);
    } else {
      // Any further primes exceed the sqrt bound, so we are done with what we have
      mSum += mobius;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mPrimorial = Functions.PRIMORIAL_COUNT.z(mN);
    mSum = 0;
    search(0, Z.ONE, 1);
    return Z.valueOf(mSum).divide2().multiply(Z.NEG_ONE.pow(mN));
  }
}
