package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165563 <code>a(n) = 1 + 2*n + n^2 + 2*n^3 + n^4</code>.
 * @author Sean A. Irvine
 */
public class A165563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165563() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 41, 151, 409});
  }
}
