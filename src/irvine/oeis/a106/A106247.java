package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106247 Expansion of (1+2*x-x^2-2*x^3+x^4) / (1-x^2)^3.
 * @author Sean A. Irvine
 */
public class A106247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106247() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 2, 2, 4, 4, 6});
  }
}
