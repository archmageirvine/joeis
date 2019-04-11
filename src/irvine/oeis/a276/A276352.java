package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276352 <code>a(n) = 100^n - 10^n</code>.
 * @author Sean A. Irvine
 */
public class A276352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276352() {
    super(new long[] {-1000, 110}, new long[] {0, 90});
  }
}
