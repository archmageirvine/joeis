package irvine.oeis.a085;
// Generated by gen_seq4.pl trigf 1, -1, 4, 0, 0, 0 1, -2, -8, 1, -8, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A085840 Triangle read by rows: T(n,m) = 4^m * (2*n+1)! / ( (2*n - 2*m + 1)! * (2*m)! ), row n has n+1 terms.
 * @author Georg Fischer
 */
public class A085840 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A085840() {
    super(0, new long[] {1, -1, 4, 0, 0, 0}, new long[] {1, -2, -8, 1, -8, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
