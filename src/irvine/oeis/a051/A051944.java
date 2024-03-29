package irvine.oeis.a051;
// Generated by gen_seq4.pl holos [[0],[-2,-4,16],[3,-1,-4]] [1,5,18] 0 at 2020-03-14 22:45
// Recurrence: -(n+1)*(4*n-3)*a[n+0]+2*(4*n+1)*(2*n-1)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051944 a(n) = C(n)*(4n+1) where C(n) = Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A051944 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051944() {
    super(0, "[[0],[-2,-4,16],[3,-1,-4]]", "[1,5,18]", 0);
  }
}
