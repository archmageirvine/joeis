package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A067600 Numbers n such that f(n) and f(f(n)) are prime, where f(k) = decimal encoding of the prime factorization of k.
 * @author Sean A. Irvine
 */
public class A067600 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Sequence seq = new HomePrimeSequence(++mN, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip();
      if (seq.next().isProbablePrime() && seq.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

