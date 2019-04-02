package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033569 (2*n - 1)*(3*n + 1).
 * @author Sean A. Irvine
 */
public class A033569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033569() {
    super(new long[] {1, -3, 3}, new long[] {-1, 4, 21});
  }
}
