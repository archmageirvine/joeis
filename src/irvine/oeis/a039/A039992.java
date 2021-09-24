package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A039992 Number of distinct primes embedded in prime p(n).
 * @author Sean A. Irvine
 */
public class A039992 extends A000040 {

  protected Z count(final Z n) {
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
        if (mPrime.isPrime(t)) {
          primes.add(t);
        }
      }
    }
    return Z.valueOf(primes.size());
  }

  @Override
  public Z next() {
    return count(super.next());
  }
}

