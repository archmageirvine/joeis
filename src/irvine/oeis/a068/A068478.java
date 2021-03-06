package irvine.oeis.a068;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A068478 Engel expansion of Gamma(3/4) = Sum_{i&gt;0} 1/Product_{n=1..i} 1/a(n).
 * @author Georg Fischer
 */
public class A068478 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A068478() {
    super();
  }

  @Override
  protected CR getN() {
    return irvine.oeis.a068.A068465.GAMMA_THREE_QUARTERS;
  }
}
