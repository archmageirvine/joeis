package irvine.oeis.a206;
// Generated by gen_seq4.pl holos [[0],[0,2,-4],[-1,-6,-4],[1]] [1,11] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A206532 a(n) = (2(n+1)(2n+1)-1) * a(n-1) + 2n(2n-1) * a(n-2), a(0) = 1, a(1) = 11.
 * @author Georg Fischer
 */
public class A206532 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A206532() {
    super(0, "[[0],[0,2,-4],[-1,-6,-4],[1]]", "[1,11]", 0);
  }
}
