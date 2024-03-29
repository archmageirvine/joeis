package irvine.oeis.a108;
// Generated by gen_seq4.pl holos [[0],[-3,1],[-21,14],[0,1]] [1,7,-24] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+7*(2*n-3)*a[n-1]+(n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108095 Coefficients of series whose square is the weight enumerator of the [8,4,4] Hamming code (see A002337).
 * @author Georg Fischer
 */
public class A108095 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108095() {
    super(0, "[[0],[-3,1],[-21,14],[0,1]]", "[1,7,-24]", 0);
  }
}
