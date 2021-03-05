package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039995 Number of distinct primes which occur as subsequences of the sequence of digits of n.
 * @author Sean A. Irvine
 */
public class A039995 implements Sequence {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  private void count(final TreeSet<Long> primes, final String s) {
    if (s.isEmpty() || s.startsWith("0")) {
      return;
    }
    final long t = Long.parseLong(s);
    if (mPrime.isPrime(t)) {
      primes.add(t);
    }
    for (int k = 1; k <= s.length(); ++k) {
      count(primes, s.substring(0, k - 1) + s.substring(k));
    }
  }

  protected Z count(final long n) {
    final TreeSet<Long> primes = new TreeSet<>();
    count(primes, String.valueOf(n));
    return Z.valueOf(primes.size());
  }

  @Override
  public Z next() {
    return count(++mN);
  }
}

