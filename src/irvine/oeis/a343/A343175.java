package irvine.oeis.a343;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A343175 a(0)=2; for n &gt; 0, a(n) = 2^(2*n-1) + 2^n + 1.
 * Lin.rec. signature: (7,-14, 8)
 * @author Georg Fischer
 */
public class A343175 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A343175() {
    super(0, "[0, 8,-14, 7,-1]", "2, 5, 13, 41, 145, 545, 2113, 8321, 33025", 0);
  }
}
