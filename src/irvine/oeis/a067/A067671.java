package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A067671 The prime factors of n are also prime factors of the decimal encoding (A067599) of the prime factorization of n.
 * @author Sean A. Irvine
 */
public class A067671 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    final Z t = new HomePrimeSequence(n, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip().next();
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (!t.mod(p).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

