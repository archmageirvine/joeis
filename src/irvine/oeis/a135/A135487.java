package irvine.oeis.a135;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A135487 a(n) = (n^2+5*n+5)*(2*n+2)!/(n+4)!.
 * @author Georg Fischer
 */
public class A135487 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135487() {
    super(2, "[[0],[-10,-40,-52,-26,-4],[4, 13, 7, 1]]", "[19, 232]", 0);
  }
}
