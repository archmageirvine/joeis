package irvine.oeis.a392;

import irvine.oeis.a391.A391217;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392729 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A392729 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A392729() {
    super(0, new A391217().prepend(0));
  }
}
