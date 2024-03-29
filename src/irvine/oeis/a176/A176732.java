package irvine.oeis.a176;
// Generated by gen_seq4.pl holos [[0],[1,-1],[-5,-1],[1]] [1,6,43,356] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(n+5)*a[n-1]+(n-1)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A176732 a(n) = (n+5)*a(n-1) + (n-1)*a(n-2), a(-1)=0, a(0)=1.
 * @author Georg Fischer
 */
public class A176732 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176732() {
    super(0, "[[0],[1,-1],[-5,-1],[1]]", "[1,6,43,356]", 0);
  }
}
