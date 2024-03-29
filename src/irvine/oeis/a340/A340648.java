package irvine.oeis.a340;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A340648 a(n) is the maximum number of nonzero entries in an n X n sign-restricted matrix.
 * Lin.rec. signature: (3,-4, 4,-3, 1)
 * @author Georg Fischer
 */
public class A340648 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A340648() {
    super(0, "[0, 1,-3, 4,-4, 3,-1]", "0, 1, 3, 6, 11, 18, 26, 35, 46, 59, 73", 0);
  }
}
