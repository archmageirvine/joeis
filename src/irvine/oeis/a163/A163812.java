package irvine.oeis.a163;
// Generated by gen_seq4.pl holos [0,1,-1,1,-1,1] [1,1,1,1,1] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A163812 Expansion of (1 - x^5) * (1 - x^6) / ((1 - x) * (1 - x^10)) in powers of x.
 * @author Georg Fischer
 */
public class A163812 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A163812() {
    super(1, "[0,1,-1,1,-1,1]", "[1,1,1,1,1]", 0);
  }
}
