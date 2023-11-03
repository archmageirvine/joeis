package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A006919.
 * @author Sean A. Irvine
 */
public class A290329 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final HomePrimeSequence seq = new HomePrimeSequence(++mN, 3, true, true);
    while (true) {
      final Z s = seq.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
