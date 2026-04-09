package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394451 Decimal expansion of the area of a 20-gon with unit side lengths.
 * @author Sean A. Irvine
 */
public class A394451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394451() {
    super(2, CR.FIVE.divide(CR.PI.divide(20).tan()));
  }
}
