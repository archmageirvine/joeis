package irvine.oeis.a292;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A292107 Decimal expansion of the number whose continued fraction expansion is A292106.
 * @author Sean A. Irvine
 */
public class A292107 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A292107() {
    super(1, new A292106());
  }
}
