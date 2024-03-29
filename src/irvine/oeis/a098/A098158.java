package irvine.oeis.a098;
// Generated by gen_seq4.pl trigf 1, 0, -1, 0, 0, 0 1, 0, -2, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A098158 Triangle T(n,k) with diagonals T(n,n-k) = binomial(n, 2*k).
 * @author Georg Fischer
 */
public class A098158 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A098158() {
    super(0, new long[] {1, 0, -1, 0, 0, 0}, new long[] {1, 0, -2, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
