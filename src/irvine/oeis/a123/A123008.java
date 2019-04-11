package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123008 Expansion of <code>-x * (3*x+1) / (25*x^2+2*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A123008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123008() {
    super(new long[] {25, 2}, new long[] {1, 5});
  }
}
