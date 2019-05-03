package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002036 Compressed primes: <code>a(n)</code> is the nearest integer to <code>prime(n)/log prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A002036 implements Sequence {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    // Perform calculation at two precisions, so that can detect
    // if we don't get the same answer -- at which point we stop.
    mP = mPrime.nextPrime(mP);
    final double log = Math.log(mP);
    final float logf = (float) log;
    final long a = (long) (mP / log + 0.5);
    final float f = mP / logf + 0.5F;
    final long b = (long) f;
    if (a != b) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(a);
  }
}

