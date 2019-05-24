package irvine.oeis.a325;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A325658 Brazilian composites of the form <code>1 + b + b^2 + b^3 +</code> ... <code>+ b^k, b &gt; 1, k &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A325658 implements Sequence {

  private long mN = 14;
  private final Fast mPrime = new Fast();

  private int repCount(final long n, final long base) {
    int c = 0;
    for (long m = n; m != 0; m /= base) {
      if (m % base != 1) {
        return 0;
      }
      ++c;
    }
    return c;
  }

  private boolean isRep(final long n) {
    for (long base = 2; base * base < n; ++base) {
      if (repCount(n, base) > 2) {
        return true;
      }
    }
    return false;
  }


  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && isRep(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
