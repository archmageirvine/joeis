package irvine.oeis.a159;
// Generated by gen_seq4.pl fract21 at 2021-10-28 23:48

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A159856 Triangle read by rows: T(n,0) = n+1, T(n,k) = 2*T(n-1,k) - T(n-1,k-1), T(n,k) = 0 if k &gt; n and if k &lt; 0.
 *
 * @author Georg Fischer
 */
public class A159856 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A159856() {
    super(0, new long[] {1, -2, 0}, new long[] {1, -4, 1, 5, -2, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0});
  }
}
