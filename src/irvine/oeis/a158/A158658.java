package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158658 a(n) = 56*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158658() {
    super(new long[] {1, -3, 3}, new long[] {55, 223, 503});
  }
}
