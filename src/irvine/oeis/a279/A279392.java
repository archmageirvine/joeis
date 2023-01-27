package irvine.oeis.a279;
// manually 2023-01-19

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002972;
import irvine.oeis.a002.A002973;

/**
 * A279392 Bisection of primes congruent to 1 modulo 4 (A002144), depending on the corresponding sum of the A002972 and 2*A002973 entries being congruent to 1 modulo 4 or not.
 * Here we give the first case.
 * @author Georg Fischer
 */
public class A279392 extends Sequence1 {

  private final A002144 mSeq1 = new A002144();
  private final A002972 mSeq2 = new A002972();
  private final A002973 mSeq3 = new A002973();

  public Z next() {
    while (true) {
      final Z a1 = mSeq1.next();
      final Z a2 = mSeq2.next().add(mSeq3.next().multiply(2)).mod(Z.FOUR);
      if (a2.equals(Z.ONE)) {
        return a1;
      }
    }
  }
}
