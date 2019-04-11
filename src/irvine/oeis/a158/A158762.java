package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158762 Expansion of <code>(1+9*x+80*x^2)/(1-x^2-729*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A158762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158762() {
    super(new long[] {729, 1, 0}, new long[] {1, 9, 81});
  }
}
