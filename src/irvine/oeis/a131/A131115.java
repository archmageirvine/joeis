package irvine.oeis.a131;
// Generated by gen_seq4.pl trigf 1, 6, -1, 0, 0, 0 1, -1, -2, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A131115 Triangle read by rows: T(n,k) = 7*binomial(n,k) for 1 &lt;= k &lt;= n with T(n,n) = 1 for n &gt;= 0.
 * @author Georg Fischer
 */
public class A131115 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A131115() {
    super(0, new long[] {1, 6, -1, 0, 0, 0}, new long[] {1, -1, -2, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
