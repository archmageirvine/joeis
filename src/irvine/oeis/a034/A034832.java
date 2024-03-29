package irvine.oeis.a034;
// Generated by gen_seq4.pl holos [[0],[2,-7],[1]] [1] 0 at 2020-02-15 22:07
// Recurrence: a[n]-(7*n-2)*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A034832 a(n) = n-th sept-factorial number divided by 5.
 * @author Georg Fischer
 */
public class A034832 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A034832() {
    super(1, "[[0],[2,-7],[1]]", "[1]", 0);
  }
}
