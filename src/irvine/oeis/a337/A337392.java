package irvine.oeis.a337;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 4: 4
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A337392 Minimum m such that the convergence speed of m^^m is equal to n &gt;= 2, where A317905(n) represents the convergence speed of m^^m (and m = A067251(n), the n-th non-multiple of 10).
 * @author Georg Fischer
 */
public class A337392 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337392() {
    super(2, "[[0],[4],[0],[3],[0],[-1]]", "[5, 25, 15, 95]", 0);
  }
}
