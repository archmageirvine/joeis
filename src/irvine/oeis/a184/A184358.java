package irvine.oeis.a184;
// Generated by gen_seq4.pl holos at 2021-05-10 22:28
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A184358 a(n) = (n+1)!^2/2^n.
 * @author Georg Fischer
 */
public class A184358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A184358() {
    super(0, "[[0],[-1,-2,-1],[2]]", "[1, 2]", 0);
  }
}
