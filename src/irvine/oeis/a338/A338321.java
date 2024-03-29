package irvine.oeis.a338;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 6: 6
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A338321 Trace of complement matrix for polynomial triangle centers of degree n (on the Nagel line).
 * @author Georg Fischer
 */
public class A338321 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A338321() {
    super(1, "[[0],[1],[-1],[-1],[0],[1],[1],[-1]]", "1, 3, 4, 5, 6, 9", 0);
  }
}
