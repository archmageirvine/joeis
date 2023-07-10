package irvine.oeis.a210;

import irvine.oeis.a000.A000215;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A210395 Decimal expansion of continued fraction with quotients equal to Fermat numbers.
 * @author Sean A. Irvine
 */
public class A210395 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A210395() {
    super(1, new A000215());
  }
}
