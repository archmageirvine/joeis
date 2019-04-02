package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106666 G.f. (1-4*x^2+2*x^3)/((1-x)*(2*x^3-2*x^2-2*x+1)).
 * @author Sean A. Irvine
 */
public class A106666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106666() {
    super(new long[] {2, -4, 0, 3}, new long[] {1, 3, 5, 13});
  }
}
