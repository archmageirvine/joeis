package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249457.
 * @author Sean A. Irvine
 */
public class A249457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249457() {
    super(new long[] {27, -111, 37}, new long[] {10, 100, 2890});
  }
}
