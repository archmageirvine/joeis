package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158574 <code>a(n) = 256*n^2 + 16</code>.
 * @author Sean A. Irvine
 */
public class A158574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158574() {
    super(new long[] {1, -3, 3}, new long[] {16, 272, 1040});
  }
}
