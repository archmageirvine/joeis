package irvine.oeis.a053;
// Generated by gen_seq4.pl holos [[0],[1],[1,-2],[1]] [0,1,3,14] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n-1)*a[n-1]-a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A053984 a(n) = (2*n-1)*a(n-1) - a(n-2), a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A053984 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053984() {
    super(0, "[[0],[1],[1,-2],[1]]", "[0,1,3,14]", 0);
  }
}
