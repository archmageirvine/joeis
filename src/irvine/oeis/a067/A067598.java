package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A067598 Decimal encoding of the prime factorization of n is a multiple of n.
 * @author Sean A. Irvine
 */
public class A067598 extends Sequence1 {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      final Z t = new HomePrimeSequence(++mN, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip().next();
      if (t.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

