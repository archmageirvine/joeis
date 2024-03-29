package irvine.oeis.a125;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A125165 Triangle read by rows: T(n,k) = C(n,k) + 3*C(n,k+1) + 2*C(n,k+2) (0&lt;=k&lt;=n).
 *
 * @author Georg Fischer
 */
public class A125165 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A125165() {
    super(0, new long[] {1, 0, 0, -1, 0, 0}, new long[] {1, -4, -1, 6, 3, 0, -4, -3, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
