package irvine.oeis.a067;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A067914 Engel expansion of zeta(6)=sum(i&gt;0,1/i^6).
 * @author Georg Fischer
 */
public class A067914 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A067914() {
    super();
  }

  @Override
  protected CR getN() {
    return CR.SIX.multiply(CR.PI.log()).exp().divide(CR.valueOf(945));
  }
}
