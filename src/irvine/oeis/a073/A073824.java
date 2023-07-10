package irvine.oeis.a073;

import irvine.oeis.a000.A000290;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A073824 Decimal expansion of number with continued fraction expansion 0, 1, 4, 9, ... (the squares).
 * @author Sean A. Irvine
 */
public class A073824 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A073824() {
    super(new A000290());
  }
}
