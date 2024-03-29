package irvine.oeis.a115;
// Generated by gen_seq4.pl holos [[0],[12,44,40],[18,31,35],[6,-13,-5]] [1,7,45,291] 0 at 2020-03-14 22:45
// Recurrence: -(n+3)*(5*n-2)*a[n+0]+(35*n^2+31*n+18)*a[n-1]+4*(5*n+3)*(2*n+1)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A115194 A sequence related to A000108 (Catalan numbers).
 * @author Georg Fischer
 */
public class A115194 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A115194() {
    super(0, "[[0],[12,44,40],[18,31,35],[6,-13,-5]]", "[1,7,45,291]", 0);
  }
}
