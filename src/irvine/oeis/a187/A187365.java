package irvine.oeis.a187;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A187365 Trisection of A000984 (central binomial coefficients): binomial(2(3n+2),3n+2)/3!, n&gt;=0.
 * @author Georg Fischer
 */
public class A187365 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A187365() {
    super(0, "[[0],[8, 16,-288,-576],[0, 2, 9, 9]]", "[1, 42]", 0);
  }
}
