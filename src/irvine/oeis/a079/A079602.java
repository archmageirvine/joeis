package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A079602 Greatest of smallest odd prime factors of all composite numbers between n-th prime and next prime.
 * @author Sean A. Irvine
 */
public class A079602 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = mPrime.nextPrime(mP);
    long res = 0;
    for (long k = mP + 1; k < q; ++k) {
      res = Math.max(res, Functions.LPF.l(Functions.MAKE_ODD.l(k)));
    }
    return Z.valueOf(res);
  }
}
