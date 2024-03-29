package irvine.oeis.a202;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A202241 Array F(n,m) read by antidiagonals: F(0,m)=1, F(n,0) = A130713(n), and column m+1 is recursively defined as the partial sums of column m.
 *
 * @author Georg Fischer
 */
public class A202241 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A202241() {
    super(0, new long[] {1, 1, 0, -1, 0, 0, -1, 0, 0, 0}, new long[] {1, -1, -1, 0, 0, 0});
  }
}
