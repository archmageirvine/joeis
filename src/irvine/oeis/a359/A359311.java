package irvine.oeis.a359;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359311 allocated for Saish S. Kambali.
 * @author Sean A. Irvine
 */
public class A359311 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  private long nextComposite(long v) {
    while (mPrime.isPrime(++v)) {
      // do nothing
    }
    return v;
  }

  @Override
  public Z next() {
    final long[] c = new long[9];
    while (true) {
      mN = nextComposite(mN);
      c[0] = mN;
      for (int k = 1; k < c.length; ++k) {
        c[k] = nextComposite(c[k - 1]);
      }
      final long s = c[0] + c[8];
      if (s == c[1] + c[7] && s == c[2] + c[6] && s == c[3] + c[5]) {
        return Z.valueOf(c[0]);
      }
    }
  }
}
