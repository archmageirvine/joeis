package irvine.oeis.a182;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A182516 Decimal expansion of log_phi(Pi), where phi is the golden ratio.
 * @author Georg Fischer
 */
public class A182516 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A182516() {
    super(1, CR.PI.log().divide(CR.PHI.log()));
  }
}
