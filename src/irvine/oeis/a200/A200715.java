package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200715 Expansion of <code>(-3*x^2+x-1)/(x^3-3*x^2+x-1)</code>.
 * @author Sean A. Irvine
 */
public class A200715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200715() {
    super(new long[] {1, -3, 1}, new long[] {1, 0, 0});
  }
}
