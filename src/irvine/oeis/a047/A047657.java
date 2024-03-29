package irvine.oeis.a047;
// Generated by gen_seq4.pl holos [[0],[4,-6],[1]] [1,2] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+2*(-3*n+2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A047657 Sextuple factorial numbers: a(n) = Product_{k=0..n-1} (6*k+2).
 * @author Georg Fischer
 */
public class A047657 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A047657() {
    super(0, "[[0],[4,-6],[1]]", "[1,2]", 0);
  }
}
