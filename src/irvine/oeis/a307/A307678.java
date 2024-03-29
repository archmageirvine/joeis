package irvine.oeis.a307;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307678 G.f. A(x) satisfies: A(x) = 1 + x*A(x)^3/(1 - x).
 * @author Georg Fischer
 */
public class A307678 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307678() {
    super(0, "[[0],[186,-155, 31],[-136, 200,-66],[10,-43, 39],[0,-2,-4]]", "[1, 1, 4]", 0);
  }
}
