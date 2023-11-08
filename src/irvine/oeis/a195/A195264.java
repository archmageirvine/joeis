package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A195264 Iterate x -&gt; A080670(x) (replace x with the concatenation of the primes and exponents in its prime factorization) starting at n until reach 1 or a prime (which is then the value of a(n)); or a(n) = -1 if a prime is never reached.
 * @author Sean A. Irvine
 */
public class A195264 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HomePrimeSequence seq = new HomePrimeSequence(mN, 10, true, HomePrimeSequence.HomePrimeType.ALONSO);
    while (true) {
      final Z s = seq.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
