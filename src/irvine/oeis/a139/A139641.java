package irvine.oeis.a139;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A139641 a(n) = binomial(n+4, 4)*7^n.
 * @author Georg Fischer
 */
public class A139641 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A139641() {
    super(0, "[[0],[-28,-7],[0, 1]]", "[1, 35]", 0);
  }
}
