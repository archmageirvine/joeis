package irvine.oeis.a230;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A230627 Prime reached in A230626, or -1 if no prime is reached.
 * @author Sean A. Irvine
 */
public class A230627 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final HomePrimeSequence seq = new HomePrimeSequence(++mN, 2, true, true);
    while (true) {
      final Z s = seq.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
