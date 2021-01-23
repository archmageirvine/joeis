package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101386 Expansion of g.f.: (5 - 3*x)/(1 - 6*x + x^2).
 * @author Sean A. Irvine
 */
public class A101386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101386() {
    super(new long[] {-1, 6}, new long[] {5, 27});
  }
}
