package irvine.oeis.a038;

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038325 Triangle read by rows whose (i,j)-th entry is binomial(i,j)*11^(i-j)*11^j.
 * @author Sean A. Irvine
 */
public class A038325 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038325() {
    super(0, new long[] {1}, new long[] {1, -11, -11});
  }
}
