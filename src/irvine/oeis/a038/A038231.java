package irvine.oeis.a038;

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038231 Triangle whose (i,j)-th entry is binomial(i,j)*4^(i-j).
 * @author Sean A. Irvine
 */
public class A038231 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038231() {
    super(0, new long[] {1}, new long[] {1, -4, -1, 0, 0, 0});
  }
}
