package irvine.oeis.a222;
// Generated by gen_seq4.pl holos [[0],[-2],[0,-1],[1]] [1,2,8] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*a[n-1]+2*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A222468 Numerator sequence of the n-th convergent of the continued fraction 1/(1+2/(2+2/(3+2/(4+...
 * @author Georg Fischer
 */
public class A222468 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A222468() {
    super(1, "[[0],[-2],[0,-1],[1]]", "[1,2,8]", 0);
  }
}
