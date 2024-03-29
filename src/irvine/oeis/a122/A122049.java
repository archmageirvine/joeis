package irvine.oeis.a122;
// Generated by gen_seq4.pl holos [[0],[-4,1],[0],[0],[-1],[1]] [0,1,2,1,1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-1]-(n-4)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A122049 a(n) = a(n-1) - (n-4)*a(n-4), with a(0)=0, a(1)=1, a(2)=2, a(3)=1.
 * @author Georg Fischer
 */
public class A122049 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122049() {
    super(0, "[[0],[-4,1],[0],[0],[-1],[1]]", "[0,1,2,1,1]", 0);
  }
}
