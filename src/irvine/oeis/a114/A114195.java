package irvine.oeis.a114;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A114195 Riordan array (1/(1-3x),x(1-x)/(1-3x)^2).
 *
 * @author Georg Fischer
 */
public class A114195 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A114195() {
    super(0, new long[] {1, -6, 0, 9, 0, 0}, new long[] {1, -9, -1, 27, 4, 0, -27, -3, 0, 0, 0, 0, 0, 0, 0});
  }
}
