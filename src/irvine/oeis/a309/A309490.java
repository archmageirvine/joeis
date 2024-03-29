package irvine.oeis.a309;
// Generated by gen_seq4.pl holos at 2021-06-05 23:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309490 Total number of adjacent node merge operations to turn a circular list of size n to a node.
 * Recurrence: a(n)=n+n*a(n-1)
 * @author Georg Fischer
 */
public class A309490 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309490() {
    super(1, "[[0, 1],[0, 1],[-1]]", "0, 1, 6, 28", 0);
  }
}
