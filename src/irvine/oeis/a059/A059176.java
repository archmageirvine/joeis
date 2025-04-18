package irvine.oeis.a059;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A059176 Engel expansion of sqrt(5) = 2.23606...
 * @author Georg Fischer
 */
public class A059176 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A059176() {
    super(CR.FIVE.sqrt());
  }
}
