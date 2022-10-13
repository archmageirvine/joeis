package irvine.oeis.a136;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A136672 Riordan array ((1+x^2)/(1-x)^2, -x/(1-x)^2).
 * @author Georg Fischer
 */
public class A136672 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A136672() {
    super(0, new long[] {1, -2, 0, 2, 0, 0, -2, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, -4, 1, 6, -2, 0, -4, 1, 0, 0, 1, 0, 0, 0, 0});
    setOffset(1);
  }
}
