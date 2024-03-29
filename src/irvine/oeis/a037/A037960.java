package irvine.oeis.a037;
// Generated by gen_seq4.pl holos [[0],[0,-2,-7,-3],[2,-5,3]] [0,1,14] 0 at 2020-03-14 22:45
// Recurrence: (3*n-2)*(n-1)*a[n+0]-n*(n+2)*(3*n+1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A037960 a(n) = n*(3*n+1)*(n+2)!/24.
 * @author Georg Fischer
 */
public class A037960 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A037960() {
    super(0, "[[0],[0,-2,-7,-3],[2,-5,3]]", "[0,1,14]", 0);
  }
}
