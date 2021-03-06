package irvine.oeis.a068;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A068479 Engel expansion of Gamma(1/4)=3.62560990822190831193...
 * @author Georg Fischer
 */
public class A068479 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A068479() {
    super();
  }

  @Override
  protected CR getN() {
    return irvine.oeis.a068.A068466.GAMMA_QUARTER;
  }
}
