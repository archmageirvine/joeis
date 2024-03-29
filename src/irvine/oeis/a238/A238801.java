package irvine.oeis.a238;
// Generated by gen_seq4.pl trigf 1 1, -2, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A238801 Triangle T(n,k), read by rows, given by T(n,k) = C(n+1, k+1)*(1-(k mod 2)).
 * @author Georg Fischer
 */
public class A238801 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A238801() {
    super(0, new long[] {1}, new long[] {1, -2, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
