package irvine.oeis.a133;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 5: 5
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A133256 a(4*n+1) = 4*n+1, a(4*n+2) = 4*n+2, a(4*n+3) = 4*n+4, a(4*n+4) = 4*n+3.
 * @author Georg Fischer
 */
public class A133256 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A133256() {
    super(1, "[[0],[-1],[1],[0],[0],[1],[-1]]", "[1, 2, 4, 3, 5]", 0);
  }
}
