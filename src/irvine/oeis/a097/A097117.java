package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097117 Expansion of <code>(1-x)/((1-x)^2 - 4*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A097117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097117() {
    super(new long[] {4, -1, 2}, new long[] {1, 1, 1});
  }
}
