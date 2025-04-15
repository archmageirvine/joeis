package irvine.oeis.a113;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A113584 Beginning with 3, least prime such that concatenation of first n terms and its digit reversal both are primes.
 * @author Sean A. Irvine
 */
public class A113584 extends Sequence1 {

  private final long mStart;
  private final Fast mPrime = new Fast();
  private Z mA = null;

  protected A113584(final long start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A113584() {
    this(3);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(mStart);
      return mA;
    } else {
      long p = 2;
      long lim = 10;
      mA = mA.multiply(10);
      while (true) {
        p = mPrime.nextPrime(p);
        if (p > lim) {
          lim *= 10;
          mA = mA.multiply(10);
        }
        final Z t = mA.add(p);
        if (t.isProbablePrime() && Functions.REVERSE.z(t).isProbablePrime()) {
          mA = t;
          return Z.valueOf(p);
        }
      }
    }
  }
}
