package irvine.oeis.a109;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A109954 Riordan array (1/(1+x)^3,x/(1+x)^2).
 *
 * @author Georg Fischer
 */
public class A109954 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A109954() {
    super(0, new long[] {1, 2, 0, 1, 0, 0}, new long[] {1, 5, -1, 10, -3, 0, 10, -3, 0, 0, 5, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0});
  }
}
