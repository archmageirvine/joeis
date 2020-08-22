package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052930 Expansion of (1-x)/(1 - x - 2*x^2 - 2*x^3 + 2*x^4).
 * @author Sean A. Irvine
 */
public class A052930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052930() {
    super(new long[] {-2, 2, 2, 1}, new long[] {1, 0, 2, 4});
  }
}
