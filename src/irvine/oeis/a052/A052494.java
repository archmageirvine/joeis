package irvine.oeis.a052;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A052494 Number of different primes that can be formed by permuting digits of n-th prime.
 * @author Sean A. Irvine
 */
public class A052494 extends A000040 {

  @Override
  public Z next() {
    final String prime = super.next().toString();
    final int[] digits = new int[prime.length()];
    for (int k = 0; k < prime.length(); ++k) {
      digits[k] = prime.charAt(k) - '0';
    }
    Arrays.sort(digits);
    // Fix so leading digit is non-zero
    int k = 0;
    while (digits[k] == 0) {
      ++k;
    }
    if (k > 0) {
      digits[0] = digits[k];
      digits[k] = 0;
    }
    int cnt = 0;
    final Permutation perm = new Permutation(digits, false);
    int[] p;
    while ((p = perm.next()) != null) {
      final Z t = A052495.permToZ(p);
      if (t.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

