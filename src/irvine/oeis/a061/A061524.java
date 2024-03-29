package irvine.oeis.a061;
// Generated by gen_seq4.pl holos [[0],[-1],[5],[-10],[10],[-5],[1]] [224,705,1600,3065,5280,8449] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=5*a[n-1]-10*a[n-2]+10*a[n-3]-5*a[n-4]+a[n-5]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A061524 Surround numbers of an n X 2 rectangle when n is even.
 * @author Georg Fischer
 */
public class A061524 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A061524() {
    super(2, "[[0],[-1],[5],[-10],[10],[-5],[1]]", "[224,705,1600,3065,5280,8449]", 0);
  }
}
