package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158666 <code>a(n) = 58*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158666() {
    super(new long[] {1, -3, 3}, new long[] {1, 59, 233});
  }
}
