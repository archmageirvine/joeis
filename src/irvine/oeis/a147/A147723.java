package irvine.oeis.a147;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A147723 Riordan array (1, x(1 - 4x)/(1 - 7x + 3x^2)).
 *
 * @author Georg Fischer
 */
public class A147723 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A147723() {
    super(0, new long[] {1, -7, 0, 3, 0, 0}, new long[] {1, -7, -1, 3, 4, 0, 0, 0, 0, 0});
  }
}
