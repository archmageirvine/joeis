package irvine.oeis.a122;
// Generated by gen_seq4.pl holos [[0],[1,-1],[-1],[1]] [1,2] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A122031 a(n) = a(n - 1) + (n - 1)*a(n - 2).
 * @author Georg Fischer
 */
public class A122031 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A122031() {
    super(0, "[[0],[1,-1],[-1],[1]]", "[1,2]", 0);
  }
}
