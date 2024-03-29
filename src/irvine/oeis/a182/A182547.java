package irvine.oeis.a182;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182547 Decimal expansion of Pi^gamma, where gamma is the Euler-Mascheroni constant.
 * Formula: Pi^gamma
 * @author Georg Fischer
 */
public class A182547 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182547() {
    super(1, CR.PI.pow(CR.GAMMA));
  }
}
