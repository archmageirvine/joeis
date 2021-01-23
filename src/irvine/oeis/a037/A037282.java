package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037282 Scan n from left to right once, erasing any primes.
 * @author Sean A. Irvine
 */
public class A037282 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    String s = String.valueOf(++mN);
    for (int k = 0; k < s.length(); ++k) {
      for (int j = s.length(); j > k; --j) {
        if (mPrime.isPrime(Long.parseLong(s.substring(k, j)))) {
          s = s.substring(0, k) + s.substring(j);
          if (k >= s.length()) {
            break; // We are definitely done with scanning
          }
          ++j; // We need to redo j
        }
      }
    }
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}

