package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A085949 Smallest multiple of prime(n) of the form r*prime(n-1) + s*prime(n+1). r and s are positive integers.
 * @author Sean A. Irvine
 */
public class A085949 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    final long q = mP;
    mP = mPrime.nextPrime(mP);
    final long r = mPrime.nextPrime(mP);
    final TwoParameterFormSequence seq = new TwoParameterFormSequence(0, 1, 1, (j, k) -> Z.valueOf(j * q + k * r));
    while (true) {
      final Z t = seq.next();
      if (t.mod(mP) == 0) {
        return t;
      }
    }
  }
}
