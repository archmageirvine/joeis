package irvine.oeis.a155;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A155110 a(n) = 8*Fibonacci(2n+1).
 * Lin.rec. signature: (3,-1)
 * @author Georg Fischer
 */
public class A155110 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A155110() {
    super(0, "[0,-1, 3,-1]", "8, 16, 40, 104, 272, 712, 1864, 4880", 0);
  }
}
