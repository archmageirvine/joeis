package irvine.oeis.a248;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A248246 Egyptian fraction representation of sqrt(18) (A010474) using a greedy function.
 * @author Georg Fischer
 */
public class A248246 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A248246() {
    super(CR.valueOf(18).sqrt());
  }
}
