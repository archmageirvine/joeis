package irvine.oeis.a125;
// Generated by gen_seq4.pl holos [0,1,0,1,-1,1,-1,1] [1,-1,0,0,0,1,2] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A125629 Expansion of -1/(1 - x + x^2 - x^3 + x^4 + x^6).
 * @author Georg Fischer
 */
public class A125629 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A125629() {
    super(1, "[0,1,0,1,-1,1,-1,1]", "[1,-1,0,0,0,1,2]", 0);
  }
}
