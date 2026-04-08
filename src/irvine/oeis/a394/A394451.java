package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394451 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A394451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394451() {
    super(2, CR.FIVE.divide(CR.PI.divide(20).tan()));
  }
}
