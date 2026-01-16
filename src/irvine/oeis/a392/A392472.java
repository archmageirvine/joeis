package irvine.oeis.a392;

import irvine.oeis.a072.A072193;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392098.
 * @author Sean A. Irvine
 */
public class A392472 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A392472() {
    super(0, new A072193().prepend(0));
  }
}
