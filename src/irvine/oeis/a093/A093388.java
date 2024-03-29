package irvine.oeis.a093;
// Generated by gen_seq4.pl holos [[0],[0,0,72],[-6,-17,-17],[1,2,1]] [1,6,42,312] 1 at 2020-03-14 22:45
// Recurrence: (n+1)^2*a[n+1]=(17*n^2+17*n+6)*a[n+0]-72*n^2*a[n-1]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A093388 (n+1)^2*a(n+1) = (17n^2+17n+6)*a(n) - 72*n^2*a(n-1).
 * @author Georg Fischer
 */
public class A093388 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A093388() {
    super(0, "[[0],[0,0,72],[-6,-17,-17],[1,2,1]]", "[1,6,42,312]", 1);
  }
}
