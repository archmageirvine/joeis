package irvine.oeis.a046;
// Generated by gen_seq4.pl holos [[0],[-30,20],[6,-9],[0,1]] [1,3,13,61] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]+3*(-3*n+2)*a[n-1]+10*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A046748 Row sums of triangle A046521.
 * @author Georg Fischer
 */
public class A046748 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A046748() {
    super(0, "[[0],[-30,20],[6,-9],[0,1]]", "[1,3,13,61]", 0);
  }
}
