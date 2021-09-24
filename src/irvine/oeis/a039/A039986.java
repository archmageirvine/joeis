package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A039986 Primes such that every distinct permutation of digits is composite (including permutations with leading zeros).
 * @author Sean A. Irvine
 */
public class A039986 extends A000040 {

  private boolean isPrime(final int[] p) {
    long t = 0;
    for (final int d : p) {
      t *= 10;
      t += d;
    }
    return mPrime.isPrime(t);
  }

  private boolean isOk(final int[] digits) {
    int primes = 0;
    final Permutation perm = new Permutation(digits);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isPrime(p) && ++primes > 1) {
        return false;
      }
    }
    return primes == 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final int[] cnts = ZUtils.digitCounts(prime);
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
      if (isOk(digits)) {
        return prime;
      }
    }
  }
}

