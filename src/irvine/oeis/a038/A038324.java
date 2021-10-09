package irvine.oeis.a038;

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038324 Triangle read by rows whose (i,j)-th entry is binomial(i,j)*11^(i-j)*10^j.
 * @author Sean A. Irvine
 */
public class A038324 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038324() {
    super(0, new long[] {1}, new long[] {1, -11, -10});
  }
}
