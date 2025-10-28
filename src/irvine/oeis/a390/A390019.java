package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390019 allocated for Michael S. Branicky.
 * @author Sean A. Irvine
 */
public class A390019 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long min = 0;
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        final long t = Long.parseLong(s.substring(0, k) + s.substring(k + 1));
        if ((min == 0 || t < min) && mPrime.isPrime(t)) {
          min = t;
        }
      }
    }
    if (min != 0) {
      return Z.valueOf(min);
    }
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      for (int d = 0; d < 10; ++d) {
        final long t = Long.parseLong(left + d + right);
        if ((min == 0 || t < min) && t != mN && mPrime.isPrime(t)) {
          min = t;
        }
      }
    }
    return Z.valueOf(min);
  }
}

