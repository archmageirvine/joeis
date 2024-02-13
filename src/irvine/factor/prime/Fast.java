package irvine.factor.prime;

import java.io.Serializable;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Implements various tests to be a good general purpose tester.
 * @author Sean A. Irvine
 */
public class Fast extends AbstractPrime implements Serializable {

  private final Feral mFeral = new Feral();

  private boolean sprpTest(final long base, final long n) {
    final long minusone = n - 1L;
    int s = 0;
    long power = minusone;
    do {
      power >>>= 1;
      ++s;
    } while ((power & 1L) == 0L);
    long t = LongUtils.modPow(base, power, n);
    if (t == 1L || t == minusone) {
      return true;
    }
    while (--s > 0) {
      t *= t;
      t %= n;
      if (t == minusone) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isPrime(final long n) {
    if ((n & 1) == 0) {
      return n == 2;
    }
    if (n < 0) {
      return false;
    }
    if (n < Feral.N) {
      return mFeral.isSmallPrime(n);
    }
    if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
      // Cases n == 3, 5, 7 already handled by feral
      return false;
    }

    // If argument is large, switch to Z code
    if (n > SQRT_MAX_VALUE) {
      return isPrime(Z.valueOf(n));
    }

    // check base-2 and base-3 strong pseudoprimes
    if (!sprpTest(2L, n)) {
      return false;
    }
    if (!sprpTest(3L, n)) {
      return false;
    }
    // if (n < 1373653L) { // Feral already tests this far
    //   return true; // [PSW80]
    // }
    if (!sprpTest(5L, n)) {
      return false;
    }
    // if (n < 25326001L) { // Feral already tests this far
    //   return true; // [PSW80]
    // }
    if (!sprpTest(7L, n)) {
      return false;
    }
    if (n == 3215031751L) {
      return false;
    }
    // n < 1186670087467 // [PSW80,Jae93]
    return true;
  }

  @Override
  public boolean isPrime(final Z n) {
    return n.isProbablePrime();
  }

  @Override
  public long nextPrime(final long n) {
    final long p = mFeral.nextPrime(n);
    if (p != 0) {
      return p;
    }
    return super.nextPrime(n);
  }

  @Override
  public long prevPrime(final long n) {
    final long p = mFeral.prevPrime(n);
    if (p != 0) {
      return p;
    }
    return super.prevPrime(n);
  }
}
