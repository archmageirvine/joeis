package irvine.oeis.a105;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A105438 Triangle, row sums = (Fibonacci numbers - 2).
 *
 * @author Georg Fischer
 */
public class A105438 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A105438() {
    super(0, new long[] {1, 0, 0, -1, 0, 0}, new long[] {1, -2, -1, 0, 2, 0, 2, -1, 0, 0, -1, 0, 0, 0, 0});
  }
}
