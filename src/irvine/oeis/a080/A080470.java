package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080470 a(n) = smallest composite number that is obtained by placing digits anywhere in n; a(n) = n if n is composite.
 * @author Sean A. Irvine
 */
public class A080470 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mPrime.isPrime(mN)) {
      final String s = String.valueOf(mN);
      long min = mN * 100;
      for (int k = 0; k <= s.length(); ++k) {
        for (int d = k == 0 ? 1 : 0; d < 10; ++d) {
          final long t = Long.parseLong(s.substring(0, k) + d + s.substring(k));
          if (t < min && !mPrime.isPrime(t)) {
            min = t;
          }
        }
      }
      return Z.valueOf(min);
    }
    return Z.valueOf(mN);
  }
}

