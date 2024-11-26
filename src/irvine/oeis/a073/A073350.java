package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073350 Primes not at the center of a 3 X 3 magic square of primes.
 * @author Sean A. Irvine
 */
public class A073350 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  // cgh
  // apb
  // efd

  private boolean is(final long p) {
    if (p == 2) {
      return false;
    }
    final long t = 2 * p;
    final long s = 3 * p;
    for (long a = 3; a < t; a = mPrime.nextPrime(a)) {
      if (a != p) {
        final long b = t - a;
        if (mPrime.isPrime(b)) {
          for (long c = 3; c < t; c = mPrime.nextPrime(c)) {
            if (c != p && c != b) {
              final long d = t - c;
              if (d != p && d != a && d != b && a != c && mPrime.isPrime(d)) {
                final long e = s - c - a;
                if (e != p && e != a && e != b && e != c && e != d && mPrime.isPrime(e)) {
                  final long f = s - e - d;
                  if (f != p && f != a && f != b && f != c && f != d && f != e && mPrime.isPrime(f)) {
                    final long g = t - f;
                    if (g != p && g != a && g != b && g != c && g != d && g != e && g != f && mPrime.isPrime(g)) {
                      final long h = s - g - c;
                      if (h != p && h != a && h != b && h != c && h != d && h != e && h != f && h + b + d == s && e + h == t && mPrime.isPrime(h)) {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}

