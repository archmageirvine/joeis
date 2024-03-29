package irvine.oeis.a110;
// Generated by gen_seq4.pl holos [[0],[-1],[0],[0],[0],[5],[0],[0],[0],[-10],[0],[0],[0],[10],[0],[0],[0],[-5],[0],[0],[0],[1]] [1,1,1,1,2,8,4,16,3,27,9,81,4,64,16,256,5,125,25,625,6] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-4]-10*a[n-8]+10*a[n-12]-5*a[n-16]+a[n-20]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A110003 n followed by n^3 followed by n^2 followed by n^4.
 * @author Georg Fischer
 */
public class A110003 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A110003() {
    super(1, "[[0],[-1],[0],[0],[0],[5],[0],[0],[0],[-10],[0],[0],[0],[10],[0],[0],[0],[-5],[0],[0],[0],[1]]", "[1,1,1,1,2,8,4,16,3,27,9,81,4,64,16,256,5,125,25,625,6]", 0);
  }
}
