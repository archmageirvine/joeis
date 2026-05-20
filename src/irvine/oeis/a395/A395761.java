package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395761 Grand-kangaroo numbers: kangaroo numbers whose inner number is itself a kangaroo number (A395720).
 * @author Sean A. Irvine
 */
public class A395761 extends FilterNumberSequence {

  private static long sK = 10000;
  private static long sM = 100000;

  /** Construct the sequence. */
  public A395761() {
    super(1, 11155, k -> {
      if (k >= sM) {
        sK = sM;
        sM *= 10;
      }
      final long m = (k % sK) / 10;
      return m >= 110 && k % m == 0 && Predicates.KANGAROO.is(m);
    });
  }
}
