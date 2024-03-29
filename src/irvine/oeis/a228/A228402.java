package irvine.oeis.a228;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A228402 Decimal expansion of the Pearson correlation coefficient where the difference between the Pearson correlation coefficient and the Spearman correlation coefficient is maximal, assuming a bivariate normal distribution and infinite sample size.
 * @author Georg Fischer
 */
public class A228402 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A228402() {
    super(0, CR.TWO.multiply(CR.PI.subtract(CR.THREE).multiply(CR.PI.add(CR.THREE)).sqrt()).divide(CR.PI));
  }
}
