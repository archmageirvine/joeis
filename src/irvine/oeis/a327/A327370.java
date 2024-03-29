package irvine.oeis.a327;
// Generated by gen_seq4.pl holos [[0],[0,-24,50,-35,10,-1],[0],[0,-14,25,-13,2],[0,-1,2,-1],[0,-6,5,-1],[2,-3,1]] [0,1,0,6,4,50] 0 at 2020-03-14 22:45
// Recurrence: (n-1)*(n-2)*a[n+0]-n*(n-3)*(n-2)*a[n-1]-n*(n-1)^2*a[n-2]+(2*n-7)*n*(n-1)*(n-2)*a[n-3]-n*(n-1)*(n-2)*(n-3)*(n-4)*a[n-5]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A327370 Number of labeled simple graphs with n vertices and exactly n - 1 endpoints (vertices of degree 1).
 * @author Georg Fischer
 */
public class A327370 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A327370() {
    super(0, "[[0],[0,-24,50,-35,10,-1],[0],[0,-14,25,-13,2],[0,-1,2,-1],[0,-6,5,-1],[2,-3,1]]", "[0,1,0,6,4,50]", 0);
  }
}
