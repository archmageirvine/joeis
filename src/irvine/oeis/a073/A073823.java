package irvine.oeis.a073;

import irvine.oeis.a000.A000217;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A073823 Decimal expansion of number with continued fraction expansion 0, 1, 3, 6, 10, ... (the triangular numbers).
 * @author Sean A. Irvine
 */
public class A073823 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A073823() {
    super(new A000217());
  }
}
