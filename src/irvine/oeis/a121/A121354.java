package irvine.oeis.a121;
// Generated by gen_seq4.pl holos [[0],[1],[1,-3],[1]] [0,1] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A121354 a(n) = (3*n-1)*a(n-1) - a(n-2).
 * @author Georg Fischer
 */
public class A121354 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A121354() {
    super(0, "[[0],[1],[1,-3],[1]]", "[0,1]", 0);
  }
}
