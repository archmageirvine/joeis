package irvine.oeis.a094;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.EuclidMullinSequence;

/**
 * A094152 a(n) is the position of prime 7 in the Euclid-Mullin (EM) sequence of type A000945, if it were started with prime(n) instead of 2.
 * @author Sean A. Irvine
 */
public class A094152 extends Sequence1 {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  private static long euclidMullin(final Z start, final long target) {
    final EuclidMullinSequence em = EuclidMullinSequence.create(start);
    long iter = 1;
    final Z t = Z.valueOf(target);
    while (true) {
      if (t.equals(em.next())) {
        return iter;
      }
      ++iter;
    }
  }

  protected long target() {
    return 7;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(euclidMullin(Z.valueOf(mP), target()));
  }
}
