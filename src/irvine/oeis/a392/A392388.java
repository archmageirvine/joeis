package irvine.oeis.a392;

import irvine.oeis.a241.A241773;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392388 Decimal expansion of the number whose continued fraction coefficients are given in A241773.
 * @author Sean A. Irvine
 */
public class A392388 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A392388() {
    super(0, new A241773().prepend(0));
  }
}

