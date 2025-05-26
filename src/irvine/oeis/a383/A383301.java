package irvine.oeis.a383;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383301 Numbers k whose primorial base expansion has the primorial base expansion of k' as its nontrivial proper suffix, where k' stands for the arithmetic derivative of k (A003415).
 * @author Sean A. Irvine
 */
public class A383301 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 4784260;

  private long a235224(long n) {
    long s = 0;
    long p = 2;
    while (n > 0) {
      ++s;
      n /= p;
      p = mPrime.nextPrime(p);
    }
    return s;
  }

  private boolean is(final long n) {
    final long ad = Functions.ARD.l(n);
    return ad > 1 && ad < n && n % Functions.PRIMORIAL_COUNT.l(a235224(ad)) == ad;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
