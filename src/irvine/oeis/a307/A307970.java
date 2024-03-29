package irvine.oeis.a307;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307970 G.f. A(x) satisfies: A(x) = 1 + x + x^2 + x^3*A(x)^2.
 * @author Georg Fischer
 */
public class A307970 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307970() {
    super(0, "[[0],[520,-210, 20],[576,-300, 36],[408,-300, 48],[80,-108, 28],[0,-18, 12],[20, 15,-5],[16, 0,-4],[0,-9,-3]]", "[1, 1, 1, 1, 2, 3, 4]", 0);
  }
}
