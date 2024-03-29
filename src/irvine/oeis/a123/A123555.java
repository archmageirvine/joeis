package irvine.oeis.a123;
// Generated by gen_seq4.pl holos [[0],[0,-6,27,-27],[-3,-1,3,1]] [0,2,16] 0 at 2020-03-14 22:45
// Recurrence: (n-1)*(n+3)*(n+1)*a[n+0]-3*n*(3*n-1)*(3*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123555 Number of standard Young tableaux of type (n+1,n,n-1).
 * @author Georg Fischer
 */
public class A123555 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123555() {
    super(0, "[[0],[0,-6,27,-27],[-3,-1,3,1]]", "[0,2,16]", 0);
  }
}
