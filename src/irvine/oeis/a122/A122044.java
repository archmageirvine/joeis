package irvine.oeis.a122;
// Generated by gen_seq4.pl holos [[0],[-3,1],[-1],[0],[1]] [0,1,2,1] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=a[n-2]-(n-3)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A122044 a(n) = a(n-2) - (n-3)*a(n-3), with a(0)=0, a(1)=1, a(2)=2.
 * @author Georg Fischer
 */
public class A122044 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122044() {
    super(0, "[[0],[-3,1],[-1],[0],[1]]", "[0,1,2,1]", 0);
  }
}
