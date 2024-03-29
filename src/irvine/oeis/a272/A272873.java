package irvine.oeis.a272;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A272873 Decimal expansion of the quadratic mean of 1 and Pi.
 * Formula: sqrt((1+Pi^2)/2)
 * @author Georg Fischer
 */
public class A272873 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A272873() {
    super(1, CR.ONE.add(CR.PI.pow(CR.TWO)).divide(CR.TWO).sqrt());
  }
}
