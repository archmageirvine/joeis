package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.HomePrimeSequence;
import irvine.oeis.Sequence1;

/**
 * A037274 Home primes: for n &gt;= 2, a(n) = the prime that is finally reached when you start with n, concatenate its prime factors (A037276) and repeat until a prime is reached (a(n) = -1 if no prime is ever reached).
 * @author Sean A. Irvine
 */
public class A037274 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HomePrimeSequence hp = new HomePrimeSequence(mN);
    Z p = null;
    Z q;
    while ((q = hp.next()) != null) {
      p = q;
    }
    return p;
  }
}

