package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094025 Expansion of <code>(1+3x)/((1-x^2)(1-3x^2))</code>.
 * @author Sean A. Irvine
 */
public class A094025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094025() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 3, 4, 12});
  }
}
