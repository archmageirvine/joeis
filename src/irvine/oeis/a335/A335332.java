package irvine.oeis.a335;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 7: 9
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A335332 Decimal representation of n-th iteration of the one-dimensional cellular automaton defined by Rule 954, based on the 4-celled von Neumann neighborhood starting with a single black cell.
 * @author Georg Fischer
 */
public class A335332 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335332() {
    super(1, "[[0],[32],[-4],[-8],[1],[-32],[4],[8],[-1]]", "[1, 11, 81, 699, 5441, 43723, 349265, 2797243, 22368577]", 0);
  }
}
