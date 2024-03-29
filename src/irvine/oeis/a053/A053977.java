package irvine.oeis.a053;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A053977 Engel expansion of the Euler-Mascheroni constant gamma A001620 = 0.57721566... .
 * @author Georg Fischer
 */
public class A053977 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A053977() {
    super();
  }

  @Override
  protected CR getN() {
    return CR.GAMMA;
  }
}
