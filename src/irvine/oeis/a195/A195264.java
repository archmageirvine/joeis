package irvine.oeis.a195;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A006919.
 * @author Sean A. Irvine
 */
public class A195264 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HomePrimeSequence seq = new HomePrimeSequence(mN, 10, true, true);
    while (true) {
      final Z s = seq.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
