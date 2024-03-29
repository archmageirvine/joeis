package irvine.oeis.a194;
// Generated by gen_seq4.pl holos [[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]] [1,-1,0,1,-1,0,1,-1,0,1,2,0] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]+a[n-10]-a[n-11]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A194519 Second coordinate of (3,7)-Lagrange pair for n.
 * @author Georg Fischer
 */
public class A194519 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A194519() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", "[1,-1,0,1,-1,0,1,-1,0,1,2,0]", 0);
  }
}
