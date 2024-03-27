package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068964 Numbers that define integer Heronian triangles [prime(a(n)), prime(a(n)+1), A068965(n)] with area A068966(n).
 * @author Sean A. Irvine
 */
public class A068964 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final long b = mPrime.nextPrime(mP);
      for (long c = mP + 1; c < mP + b; ++c) {
        final long s2 = mP + b + c;
        final Z delta = Z.valueOf(s2).multiply(s2 - 2 * mP).multiply(s2 - 2 * b).multiply(s2 - 2 * c);
        if (delta.mod(16) == 0 && delta.isSquare()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
