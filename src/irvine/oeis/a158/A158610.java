package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158610 Expansion of <code>(1+15*x)/(1-x-256*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A158610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158610() {
    super(new long[] {256, 1}, new long[] {1, 16});
  }
}
