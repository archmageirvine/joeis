package irvine.oeis.a096;
// Generated by gen_seq4.pl holos [[0],[4],[-5],[1]] [1,10,46,190] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-1]-4*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A096045 a(n) = B(2*n, 2)/B(2*n) (see formula section).
 * @author Georg Fischer
 */
public class A096045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A096045() {
    super(0, "[[0],[4],[-5],[1]]", "[1,10,46,190]", 0);
  }
}
