package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073496 Expansion of <code>(3 + 2*x + 3*x^2)/(1 + x + 3*x^2 - x^3)</code>.
 * @author Sean A. Irvine
 */
public class A073496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073496() {
    super(new long[] {1, -3, -1}, new long[] {3, -1, -5});
  }
}
