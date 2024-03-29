package irvine.oeis.a227;
// Generated by gen_seq4.pl holos [[0],[-6,27,-27],[0,-2,4]] [1,4,20] 0 at 2020-03-14 22:45
// Recurrence: 2*n*(2*n-1)*a[n+0]-3*(3*n-1)*(3*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A227726 a(n) = [x^n] (1 + x)/(1 - x)^(2*n+1).
 * @author Georg Fischer
 */
public class A227726 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A227726() {
    super(0, "[[0],[-6,27,-27],[0,-2,4]]", "[1,4,20]", 0);
  }
}
