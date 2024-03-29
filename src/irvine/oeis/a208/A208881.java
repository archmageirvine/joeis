package irvine.oeis.a208;
// Generated by gen_seq4.pl holos [[0],[-6,27,-27],[0,0,1]] [1,2,30] 0 at 2020-03-14 22:45
// Recurrence: n^2*a[n+0]-3*(3*n-1)*(3*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A208881 Number of words either empty or beginning with the first letter of the ternary alphabet, where each letter of the alphabet occurs n times.
 * @author Georg Fischer
 */
public class A208881 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A208881() {
    super(0, "[[0],[-6,27,-27],[0,0,1]]", "[1,2,30]", 0);
  }
}
