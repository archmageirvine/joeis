package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153794 4 times octagonal numbers: a(n) = 4*n*(3*n-2).
 * @author Sean A. Irvine
 */
public class A153794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153794() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 32});
  }
}
