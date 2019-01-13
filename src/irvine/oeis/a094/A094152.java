package irvine.oeis.a094;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.EuclidMullinSequence;
import irvine.oeis.Sequence;

/**
 * A094152.
 * @author Sean A. Irvine
 */
public class A094152 implements Sequence {

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
