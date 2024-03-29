package irvine.oeis.a167;
// Generated by gen_seq4.pl manch4/holos at 2024-03-12 13:36

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A167632 Smallest m such that A033183(m) = n.
 * @author Georg Fischer
 */
public class A167632 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A167632() {
    super(0, "[[0], [0, 1, 0, -1], [0, -2, -1, 1]]", "0, 4, 36, 72, 108, 144, 180, 216, 252", 0);
  }
}
