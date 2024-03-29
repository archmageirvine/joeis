package irvine.oeis.a187;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A187358 Catalan trisection: A000108(3*n+1), n&gt;=0.
 * C(3*n+1)
 * @author Georg Fischer
 */
public class A187358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187358() {
    super(0, "[[0],[-8, 16, 288,-576],[0, 2, 9, 9]]", "[1]", 0);
  }
}
