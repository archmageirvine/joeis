package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-05-23 21:35
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126934 Define an array by d(m, 0) = 1, d(m, 1) = m; d(m, k) = (m - k + 1) d(m+1, k-1) - (k-1) (m+1) d(m+2, k-2). Sequence gives d(0,2n).
 * @author Georg Fischer
 */
public class A126934 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126934() {
    super(0, "[[0],[-2, 8,-8]],[-1, 0]]", "1,-2, 36,-1800", 0);
  }
}
