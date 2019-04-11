package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158537 <code>a(n) = 22*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158537() {
    super(new long[] {1, -3, 3}, new long[] {1, 23, 89});
  }
}
