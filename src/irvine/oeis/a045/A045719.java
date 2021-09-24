package irvine.oeis.a045;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A045719 Number of primes embedded in n-th prime.
 * @author Sean A. Irvine
 */
public class A045719 extends A000040 {

  @Override
  public Z next() {
    final String sp = super.next().toString();
    final int[] digits = new int[sp.length()];
    for (int k = 0; k < digits.length; ++k) {
      digits[k] = sp.charAt(k) - '0';
    }
    Arrays.sort(digits);
    final TreeSet<Long> primes = new TreeSet<>();
    final Permutation perm = new Permutation(digits);
    int[] p;
    while ((p = perm.next()) != null) {
      long q = 0;
      for (final int i : p) {
        q *= 10;
        q += i;
        if (mPrime.isPrime(q)) {
          primes.add(q);
        }
      }
    }
    return Z.valueOf(primes.size() - 1);
  }
}
