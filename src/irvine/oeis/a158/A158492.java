package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158492 a(n) = 100*n^2 + 10.
 * @author Sean A. Irvine
 */
public class A158492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158492() {
    super(new long[] {1, -3, 3}, new long[] {10, 110, 410});
  }
}
