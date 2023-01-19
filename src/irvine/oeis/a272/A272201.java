package irvine.oeis.a272;
// manually 2023-01-19

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001479;
import irvine.oeis.a002.A002476;

/**
 * A272201 Bisection of primes congruent to 1 modulo 3 (A002476), depending on the corresponding A001479 entry being congruent to 1 modulo 3 or not. Here the second case.
 * @author Georg Fischer
 */
public class A272201 extends Sequence1 {

  private final A001479 mSeq1 = new A001479();
  private final A002476 mSeq2 = new A002476();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z a1 = mSeq1.next();
      final Z a2 = mSeq2.next();
      if (!a1.mod(Z.THREE).equals(Z.ONE)) {
        return a2;
      }
    }
  }
}
