package irvine.oeis.a069;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;


/**
 * A069139 Egyptian fraction for square root of 1/2.
 * @author Georg Fischer
 */
public class A069139 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A069139() {
    super(CR.TWO.inverse().sqrt());
  }
}
