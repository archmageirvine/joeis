package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122008 Expansion of <code>(2*x-1)*(x-1)*x / ((3*x-1)*(3*x^2-1))</code>.
 * @author Sean A. Irvine
 */
public class A122008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122008() {
    super(new long[] {-9, 3, 3}, new long[] {1, 0, 5});
  }
}
