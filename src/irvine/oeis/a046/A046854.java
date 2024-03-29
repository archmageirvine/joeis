package irvine.oeis.a046;
// Generated by gen_seq4.pl trigf 1, 1, 0 1, 0, -1, -1, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A046854 Triangle T(n, k) = binomial(floor((n+k)/2), k), n&gt;=0, n &gt;= k &gt;= 0.
 * @author Georg Fischer
 */
public class A046854 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A046854() {
    super(0, new long[] {1, 1, 0}, new long[] {1, 0, -1, -1, 0, 0});
  }
}
