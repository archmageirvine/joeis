package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053586 Primes formed by concatenating n consecutive decreasing numbers starting with a prime p(n) and ending with the previous prime p(n-1).
 * @author Sean A. Irvine
 */
public class A053586 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 83;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      final StringBuilder sb = new StringBuilder();
      for (long k = mP; k >= q; --k) {
        sb.append(k);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
