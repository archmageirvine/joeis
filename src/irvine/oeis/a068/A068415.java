package irvine.oeis.a068;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A068415 Engel expansion of log(Pi/2).
 * @author Georg Fischer
 */
public class A068415 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A068415() {
    super(CR.PI.log().subtract(CR.TWO.log()));
  }
}
