package irvine.oeis.a331;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A331322 a(n) = (3*n + 1)!/(n!)^3.
 * @author Georg Fischer
 */
public class A331322 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331322() {
    super(0, "[[0],[3, 0,-27],[0, 0, 1]]", "[1, 24]", 0);
  }
}
