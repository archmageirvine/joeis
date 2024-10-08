package irvine.oeis.a082;
// Generated by gen_seq4.pl holos [[0],[-18,9],[5,-10],[1,1]] [1,4,20] 0 at 2020-02-15 22:07
// Recurrence: (n+1)*a[n+0]=5*(2*n-1)*a[n-1]-9*(n-2)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082298 Expansion of (1-3*x-sqrt(9*x^2-10*x+1))/(2*x).
 * @author Georg Fischer
 */
public class A082298 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082298() {
    super(0, "[[0],[-18,9],[5,-10],[1,1]]", "[1,4,20]", 0);
  }
}
