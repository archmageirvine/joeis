package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002036 Compressed primes: a(n) is the nearest integer to prime(n)/log prime(n).
 * @author Sean A. Irvine
 */
public class A002036 implements Sequence {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final CR p = CR.valueOf(mP);
    return p.divide(p.log()).round();
  }
}

