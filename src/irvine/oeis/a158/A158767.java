package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158767 <code>a(n) = 76*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158767() {
    super(new long[] {1, -3, 3}, new long[] {1, 77, 305});
  }
}
