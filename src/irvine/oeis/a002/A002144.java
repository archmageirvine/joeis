package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002144 Pythagorean primes: primes of the form 4*k + 1.
 * @author Sean A. Irvine
 */
public class A002144 extends AbstractSequence {

  /** Construct the sequence. */
  public A002144() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 3) == 1) {
        final long lim = mP / 2;
        for (long x = 1; x * x <= lim; ++x) {
          final long d = mP - x * x;
          final long s = Functions.SQRT.l(d);
          if (s * s == d) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}
