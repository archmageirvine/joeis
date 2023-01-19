package irvine.oeis.a272;
// manually 2023-01-19

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001479;
import irvine.oeis.a002.A002476;

/**
 * A272204 A bisection of the primes congruent to 1 modulo 3 (A002476). This is the part depending on the corresponding A001479 entry being congruent to 1 or 2 modulo 6.
 * @author Georg Fischer
 */
public class A272204 extends Sequence1 {

  private final A001479 mSeq1 = new A001479();
  private final A002476 mSeq2 = new A002476();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z a1 = mSeq1.next().mod(Z.SIX);
      final Z a2 = mSeq2.next();
      if (a1.equals(Z.ONE) || a1.equals(Z.TWO)) {
        return a2;
      }
    }
  }
}
