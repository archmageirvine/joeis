package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158744 <code>a(n) = 74*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158744() {
    super(new long[] {1, -3, 3}, new long[] {73, 295, 665});
  }
}
