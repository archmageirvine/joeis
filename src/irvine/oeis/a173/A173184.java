package irvine.oeis.a173;
// Generated by gen_seq4.pl holos [[0],[2,1],[0],[-3,-1],[1]] [1,1,2,4] 3 at 2020-03-14 22:45
// Recurrence: a[n+3]-(n+3)*a[n+2]+(n+2)*a[n+0]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A173184 Partial sums of A000166.
 * @author Georg Fischer
 */
public class A173184 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173184() {
    super(0, "[[0],[2,1],[0],[-3,-1],[1]]", "[1,1,2,4]", 3);
  }
}
