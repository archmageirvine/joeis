package irvine.oeis.a242;
// Generated by gen_seq4.pl holos [[0],[1],[1,-2],[1]] [1,2] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A242227 a(n) = (2*n-1) * a(n-1) - a(n-2), a(0) = 1, a(1) = 2.
 * @author Georg Fischer
 */
public class A242227 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A242227() {
    super(0, "[[0],[1],[1,-2],[1]]", "[1,2]", 0);
  }
}
