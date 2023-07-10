package irvine.oeis.a073;

import irvine.oeis.a000.A000045;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A073822 Decimal expansion of number with continued fraction expansion 0, 1, 1, 2, 3, 5, ... (the Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A073822 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A073822() {
    super(new A000045());
  }
}
