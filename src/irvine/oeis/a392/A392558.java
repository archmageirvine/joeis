package irvine.oeis.a392;

import irvine.oeis.a390.A390946;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392558 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A392558 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A392558() {
    super(0, new A390946().prepend(0));
  }
}
