package irvine.oeis.a080;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080409 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A080409() {
    super(1, new A080408());
  }
}
