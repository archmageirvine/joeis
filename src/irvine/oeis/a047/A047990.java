package irvine.oeis.a047;
// Generated by gen_seq4.pl holos [[0],[-2,2,-1],[-1],[1]] [1,2] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A047990 a(n+1) = a(n) + (n^2 + 1)*a(n-1).
 * @author Georg Fischer
 */
public class A047990 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A047990() {
    super(0, "[[0],[-2,2,-1],[-1],[1]]", "[1,2]", 0);
  }
}
