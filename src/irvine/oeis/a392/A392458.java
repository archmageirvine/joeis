package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392458 Decimal expansion of the area of a 16-gon with unit side lengths.
 * @author Sean A. Irvine
 */
public class A392458 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392458() {
    super(2, CR.FOUR.divide(CR.PI.divide(16).tan()));
  }
}
