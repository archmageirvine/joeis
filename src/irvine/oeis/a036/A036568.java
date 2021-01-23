package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A036568 Continued fraction for ratio of small diagonal to side of regular 17-gon.
 * @author Sean A. Irvine
 */
public class A036568 extends ContinuedFractionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(17)).cos().multiply(2);

  /** Construct the sequence. */
  public A036568() {
    super(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return N;
      }
    });
  }
}
