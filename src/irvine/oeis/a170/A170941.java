package irvine.oeis.a170;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[0,-1],[-1],[1]] [1,1,1,2] 1 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A170941 a(n+1) = a(n) + n*a(n-1) - a(n-2) + a(n-3).
 * @author Georg Fischer
 */
public class A170941 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A170941() {
    super(0, "[[0],[-1],[1],[0,-1],[-1],[1]]", "[1,1,1,2]", 1);
  }
}
