package irvine.oeis.a271;
// Generated by gen_seq4.pl holos [[0],[4,-2],[1,-2],[1]] [1,2,6,34] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=(2*n-1)*a[n-1]+2*(n-2)*a[n-2]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A271212 a(n) = (2n-1)*a(n-1) + 2*(n-2)*a(n-2).
 * @author Georg Fischer
 */
public class A271212 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A271212() {
    super(0, "[[0],[4,-2],[1,-2],[1]]", "[1,2,6,34]", 0);
  }
}
