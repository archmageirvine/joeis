package irvine.oeis.a127;
// Generated by gen_seq4.pl trigf 1, 1, -2, 0, 0, 0 1, 2, -4, 1, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A127674 Coefficient table for Chebyshev polynomials T(2*n,x) (increasing even powers x, without zeros).
 * @author Georg Fischer
 */
public class A127674 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A127674() {
    super(0, new long[] {1, 1, -2, 0, 0, 0}, new long[] {1, 2, -4, 1, 0, 0});
  }
}
