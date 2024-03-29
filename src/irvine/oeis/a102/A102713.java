package irvine.oeis.a102;
// Generated by gen_seq4.pl holos [[0],[4],[4],[-3],[-2],[1]] [1,2,8,18,48] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]+3*a[n-2]-4*a[n-3]-4*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A102713 Total sum of odd parts in all compositions of n.
 * @author Georg Fischer
 */
public class A102713 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102713() {
    super(1, "[[0],[4],[4],[-3],[-2],[1]]", "[1,2,8,18,48]", 0);
  }
}
