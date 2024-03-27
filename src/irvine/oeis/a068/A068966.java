package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068966 Areas of integer Heronian triangles [prime(A068964(n)), prime(A068964(n)+1), A068965(n)].
 * @author Sean A. Irvine
 */
public class A068966 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long b = mPrime.nextPrime(mP);
      for (long c = mP + 1; c < mP + b; ++c) {
        final long s2 = mP + b + c;
        final Z delta = Z.valueOf(s2).multiply(s2 - 2 * mP).multiply(s2 - 2 * b).multiply(s2 - 2 * c);
        if (delta.mod(16) == 0) {
          final Z[] d = delta.shiftRight(4).sqrtAndRemainder();
          if (d[1].isZero()) {
            return d[0];
          }
        }
      }
    }
  }
}
