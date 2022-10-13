package irvine.oeis.a135;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A135552 Riordan array (1/((1-2x)(1-x)^2), -x/(1-x)^2).
 * @author Georg Fischer
 */
public class A135552 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A135552() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, -6, 1, 14, -4, 0, -16, 5, 0, 0, 9, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
