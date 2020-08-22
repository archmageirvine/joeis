package irvine.oeis.a094;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.EuclidMullinSequence;
import irvine.oeis.Sequence;

/**
 * A094153 a(n) is least prime p such that 7 is the n-th term in the Euclid-Mullin sequence starting at p, or 0 if no such prime p exists.
 * @author Sean A. Irvine
 */
public class A094153 implements Sequence {

  private int mN = 0;

  private static boolean euclidMullin(final Z start, final long target, final long position) {
    final EuclidMullinSequence em = EuclidMullinSequence.create(start);
    long iter = 1;
    final Z t = Z.valueOf(target);
    while (iter <= position) {
      final Z next = em.next();
      if (t.equals(next)) {
        return iter == position;
      }
      ++iter;
    }
    return false;
  }

  protected long target() {
    return 7;
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    final Fast prime = new Fast();
    Z p = Z.ONE;
    while (true) {
      p = prime.nextPrime(p);
      if (euclidMullin(p, target(), mN)) {
        return p;
      }
    }
  }
}
