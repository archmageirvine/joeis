package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106805 G.f.: 1 / (1-2*x-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A106805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106805() {
    super(new long[] {-1, 1, 2}, new long[] {1, 2, 5});
  }
}
