package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A050768 Iterated procedure 'composite k added to sum of its prime factors reaches a prime' yields 1 skipped prime.
 * @author Sean A. Irvine
 */
public class A050768 extends A050703 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (!n.isProbablePrime()) {
        Z t = f(n);
        while (!t.isProbablePrime()) {
          t = f(t);
        }
        Z p = n;
        for (int k = 0; k <= iterations() && p.compareTo(t) <= 0; ++k) {
          p = mPrime.nextPrime(p);
        }
        if (t.equals(p)) {
          return n;
        }
      }
    }
  }
}
