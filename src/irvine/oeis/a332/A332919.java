package irvine.oeis.a332;
// Generated by gen_seq4.pl holos [[0],[100],[-20],[1]] [285,5415,79800] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=20*a[n-1]-100*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A332919 a(n) is the sum of the sums of squared digits of all n-digit numbers.
 * @author Georg Fischer
 */
public class A332919 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A332919() {
    super(1, "[[0],[100],[-20],[1]]", "[285,5415,79800]", 0);
  }
}
