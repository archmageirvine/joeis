package irvine.oeis.a333;

import irvine.oeis.a000.A000032;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A333521 Decimal expansion of the continued fraction expansion [2; 1, 3, 4, 7, 11, ...] (the Lucas numbers, A000032).
 * @author Sean A. Irvine
 */
public class A333521 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A333521() {
    super(1, new A000032());
  }
}
