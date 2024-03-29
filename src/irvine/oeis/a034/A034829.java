package irvine.oeis.a034;
// Generated by gen_seq4.pl holos [[0],[5,-7],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(7*n-5)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A034829 a(n) = n-th sept-factorial number divided by 2.
 * @author Georg Fischer
 */
public class A034829 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034829() {
    super(1, "[[0],[5,-7],[1]]", "[1]", 0);
  }
}
