package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039997 Number of distinct primes which occur as substrings of the digits of n.
 * @author Sean A. Irvine
 */
public class A039997 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  protected Z count(final long n) {
    final String s = String.valueOf(n);
    final TreeSet<Long> primes = new TreeSet<>();
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) != '0') {
        for (int j = k + 1; j <= s.length(); j++) {
          final long t = Long.parseLong(s.substring(k, j));
          if (mPrime.isPrime(t)) {
            primes.add(t);
          }
        }
      }
    }
    return Z.valueOf(primes.size());
  }

  @Override
  public Z next() {
    return count(++mN);
  }
}

