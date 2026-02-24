package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392458 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A392458 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392458() {
    super(2, CR.FOUR.divide(CR.PI.divide(16).tan()));
  }
}
