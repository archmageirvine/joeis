package irvine.oeis.a333;

import irvine.oeis.a000.A000204;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A333567 Decimal expansion of the continued fraction expansion [1; 3, 4, 7, 11, 18,...] (the Lucas numbers beginning at 1, A000204).
 * @author Sean A. Irvine
 */
public class A333567 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A333567() {
    super(1, new A000204());
  }
}
