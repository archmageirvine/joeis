package irvine.oeis.a272;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A272535 Decimal expansion of the edge length of a regular 16-gon with unit circumradius.
 * @author Georg Fischer
 */
public class A272535 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A272535() {
    super(0, CR.TWO.multiply(CR.PI.divide(CR.valueOf(16)).sin()));
  }
}
