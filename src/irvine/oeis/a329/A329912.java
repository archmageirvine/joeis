package irvine.oeis.a329;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A329912 Engel expansion of exp(Pi/4).
 * @author Georg Fischer
 */
public class A329912 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A329912() {
    super();
  }

  @Override
  protected CR getN() {
    return CR.PI.divide(CR.FOUR).exp();
  }
}
