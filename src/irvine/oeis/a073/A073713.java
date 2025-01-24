package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066272;

/**
 * A073713 Numbers k such that the number of distinct primes dividing k = number of anti-divisors of k.
 * @author Sean A. Irvine
 */
public class A073713 extends Sequence1 {

  private long mN = 0;
  private final DirectSequence mSeq = new A066272();

  @Override
  public Z next() {
    while (true) {
      if (mSeq.next().equals(Functions.OMEGA.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
