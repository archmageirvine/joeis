package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077997 Expansion of <code>(1-x)/(1-2*x-x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077997() {
    super(new long[] {1, 1, 2}, new long[] {1, 1, 3});
  }
}
