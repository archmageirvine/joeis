package irvine.oeis.a102;
// Generated by gen_seq4.pl holos [[0],[0,4,-4,1],[0,0,-1],[0,-1],[1]] [0,1,2,15,76] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=n*a[n-1]+n^2*a[n-2]-(n-2)^2*n*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A102289 Total number of odd lists in all sets of lists, cf. A000262.
 * @author Georg Fischer
 */
public class A102289 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102289() {
    super(0, "[[0],[0,4,-4,1],[0,0,-1],[0,-1],[1]]", "[0,1,2,15,76]", 0);
  }
}
