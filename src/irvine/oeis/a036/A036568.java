package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A036568 Continued fraction for ratio of small diagonal to side of regular 17-gon.
 * @author Sean A. Irvine
 */
public class A036568 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A036568() {
    super(new DecimalExpansionSequence(CR.PI.divide(CR.valueOf(17)).cos().multiply(2)));
  }
}
