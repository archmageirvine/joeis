package irvine.oeis.a241;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A241746 Smallest number greater than n that CANNOT be scored using n darts on a standard dartboard.
 * Lin.rec. signature: (2,-1)
 * @author Georg Fischer
 */
public class A241746 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A241746() {
    super(1, "[0,-1, 2,-1]", "23, 103, 163, 223, 283, 343, 403, 463", 0);
  }
}
