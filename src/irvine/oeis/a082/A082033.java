package irvine.oeis.a082;
// Generated by gen_seq4.pl holos [[0],[-2,2],[-5,-3],[3]] [1,4,14,60] 0 at 2020-03-14 22:45
// Recurrence: 3*a[n+0]+(-3*n-5)*a[n-1]+2*(n-1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082033 a(n) = (3n+1)*n!.
 * @author Georg Fischer
 */
public class A082033 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082033() {
    super(0, "[[0],[-2,2],[-5,-3],[3]]", "[1,4,14,60]", 0);
  }
}
