package irvine.oeis.a122;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A122438 Riordan array (1/(1-2x), x(1+2x)).
 *
 * @author Georg Fischer
 */
public class A122438 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A122438() {
    super(0, new long[] {1}, new long[] {1, -2, -1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0});
  }
}
