package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158004 a(n) = 392*n - 1.
 * @author Sean A. Irvine
 */
public class A158004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158004() {
    super(new long[] {-1, 2}, new long[] {391, 783});
  }
}
