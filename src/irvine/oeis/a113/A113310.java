package irvine.oeis.a113;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A113310 Riordan array ((1+x)/(1-x),x/(1+x)).
 *
 * @author Georg Fischer
 */
public class A113310 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A113310() {
    super(0, new long[] {1, 2, 0, 1, 0, 0}, new long[] {1, 0, -1, -1, 1, 0, 0, 0, 0, 0});
  }
}
