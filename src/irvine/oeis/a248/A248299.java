package irvine.oeis.a248;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A248299 Egyptian fraction representation of sqrt(75) (A010527) using a greedy function.
 * @author Georg Fischer
 */
public class A248299 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A248299() {
    super(CR.valueOf(75).sqrt());
  }
}
