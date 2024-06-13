package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A065852 Let u be any string of 3 digits from {0,...,n-1}; let f(u) = number of distinct primes, not beginning with 0, formed by permuting the digits of u; then a(n) = max_u f(u).
 * @author Sean A. Irvine
 */
public class A065852 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final int mDigits;
  private int mN = 1;

  protected A065852(final int digits) {
    mDigits = digits;
  }

  /** Construct the sequence. */
  public A065852() {
    this(3);
  }

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    final Bumper bumper = BumperFactory.weaklyIncreasing(mN - 1);
    final int[] digits = new int[mDigits];
    // can immediately start with a bump as all 0s is never prime
    while (bumper.bump(digits)) {
      long cnt = 0;
      final Permutation perm = new Permutation(digits, false);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          long v = 0;
          for (final int u : p) {
            v *= mN;
            v += u;
          }
          if (mPrime.isPrime(v)) {
            ++cnt;
          }
        }
      }
      if (cnt > max) {
        max = cnt;
      }
    }
    return Z.valueOf(max);
  }
}

