package irvine.oeis.a117;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A117316 Riordan array ((1-x)/(1-x-2x^2),x(1-x)/(1-x-2x^2)).
 *
 * @author Georg Fischer
 */
public class A117316 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A117316() {
    super(0, new long[] {1, -2, 0, -1, 0, 0, 2, 0, 0, 0}, new long[] {1, -2, -1, -3, 2, 0, 4, 1, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
