package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A085950 Smallest multiple of prime(n) of the form r*prime(n-1) + s*prime(n-2). r and s are positive integers.
 * @author Sean A. Irvine
 */
public class A085950 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    final long q = mP;
    final long r = mPrime.prevPrime(q);
    mP = mPrime.nextPrime(mP);
    final TwoParameterFormSequence seq = new TwoParameterFormSequence(0, 1, 1, (j, k) -> Z.valueOf(j * q + k * r));
    while (true) {
      final Z t = seq.next();
      if (t.mod(mP) == 0) {
        return t;
      }
    }
  }
}
