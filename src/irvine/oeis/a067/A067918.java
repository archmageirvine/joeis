package irvine.oeis.a067;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A067918 Engel expansion of zeta(10) = Sum_{i&gt;0} 1/i^10.
 * @author Georg Fischer
 */
public class A067918 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A067918() {
    super(CR.TEN.multiply(CR.PI.log()).exp().divide(CR.valueOf(93555)));
  }
}
