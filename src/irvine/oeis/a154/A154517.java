package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154517 a(n) = 9*n^2 + n.
 * @author Sean A. Irvine
 */
public class A154517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154517() {
    super(new long[] {1, -3, 3}, new long[] {10, 38, 84});
  }
}
