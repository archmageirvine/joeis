package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A290329 Iterate the map x -&gt; A289667(x) starting at n; sequence gives primes reached, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A290329 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final HomePrimeSequence seq = new HomePrimeSequence(++mN, 3, true, HomePrimeSequence.HomePrimeType.ALONSO);
    while (true) {
      final Z s = seq.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
