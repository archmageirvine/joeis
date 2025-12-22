package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082786 Triangle, read by rows, of exponents of primes in canonical prime factorization of n: T(n,k) = greatest number such that prime(k)^T(n,k) divides n, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A082786 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mP = 2;
    } else {
      mP = mPrime.nextPrime(mP);
    }
    return Functions.VALUATION.z(mN, mP);
  }
}
