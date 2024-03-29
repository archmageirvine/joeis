package irvine.oeis.a038;
// Generated by gen_seq4.pl holos [[0],[-2,3,-1],[0],[1,-1],[1]] [1,0,0,2] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n-1)*a[n-1]+(n-1)*(n-2)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A038205 Number of derangements of n where minimal cycle size is at least 3.
 * @author Georg Fischer
 */
public class A038205 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038205() {
    super(0, "[[0],[-2,3,-1],[0],[1,-1],[1]]", "[1,0,0,2]", 0);
  }
}
