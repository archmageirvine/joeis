package irvine.oeis.a109;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A109960 Number triangle binomial(n+3k,4k).
 *
 * @author Georg Fischer
 */
public class A109960 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A109960() {
    super(0, new long[] {1, -4, 0, 6, 0, 0, -4, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, -5, -1, 10, 1, 0, -10, 0, 0, 0, 5, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0});
  }
}
