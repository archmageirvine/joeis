package irvine.oeis.a321;
// Generated by gen_seq4.pl holos [[0],[2,-3,1],[1,-2],[1]] [1,2,8] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n-1)*a[n-1]-(n-1)*(n-2)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A321942 A sequence related to the Euler-Gompertz constant.
 * @author Georg Fischer
 */
public class A321942 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A321942() {
    super(1, "[[0],[2,-3,1],[1,-2],[1]]", "[1,2,8]", 0);
  }
}
