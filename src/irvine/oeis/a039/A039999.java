package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A039999 Number of permutations of digits of n which yield distinct primes.
 * @author Sean A. Irvine
 */
public class A039999 implements Sequence {

  protected final Fast mPrime = new Fast();
  private long mN = 0;

  protected Z count(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    int total = 0;
    for (final int c : cnts) {
      total += c;
    }
    final int[] digits = new int[total];
    for (int d = 0, k = 0; d < cnts.length; ++d) {
      for (int j = 0; j < cnts[d]; ++j) {
        digits[k++] = d;
      }
    }
    final TreeSet<Long> primes = new TreeSet<>();
    final Permutation perm = new Permutation(digits);
    int[] p;
    while ((p = perm.next()) != null) {
      long t = 0;
      for (final int d : p) {
        t *= 10;
        t += d;
      }
      if (mPrime.isPrime(t)) {
        primes.add(t);
      }
    }
    return Z.valueOf(primes.size());
  }

  @Override
  public Z next() {
    return count(++mN);
  }
}

