package irvine.oeis.a119;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A119580 a(n) = (n^2+n^3)*binomial(2*n,n).
 * @author Georg Fischer
 */
public class A119580 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A119580() {
    super(0, "[[0],[2,-2,-4],[1,-2, 1]]", "[0, 4, 72]", 0);
  }
}
