package irvine.oeis.a071;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071879 G.f. satisfies: A(x) = 1 + x*A(x) + x^3*A(x)^3.
 * @author Georg Fischer
 */
public class A071879 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071879() {
    super(0, "[[0],[62,-93, 31],[-6, 18,-12],[-2, 0, 12],[0,-6,-4]]", "[1, 1, 1]", 0);
  }
}
