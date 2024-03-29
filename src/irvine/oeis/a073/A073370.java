package irvine.oeis.a073;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A073370 Convolution triangle of A001045(n+1) (generalized (1,2)-Fibonacci), n&gt;=0.
 *
 * @author Georg Fischer
 */
public class A073370 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A073370() {
    super(0, new long[] {1, -1, 0, -2, 0, 0}, new long[] {1, -2, -1, -3, 1, 0, 4, 2, 0, 0, 4, 0, 0, 0, 0});
  }
}
