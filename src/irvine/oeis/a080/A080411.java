package irvine.oeis.a080;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080411 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A080411() {
    super(1, new A080410());
  }
}
