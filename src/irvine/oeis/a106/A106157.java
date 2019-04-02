package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106157 G.f. (1-x-x^3+x^4-2*x^2)/((1-2*x)*(x-1)^2*(x+1)^2).
 * @author Sean A. Irvine
 */
public class A106157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106157() {
    super(new long[] {2, -1, -4, 2, 2}, new long[] {-1, -1, -2, -1, -2});
  }
}
