package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226233 Ten copies of each positive integer.
 * @author Sean A. Irvine
 */
public class A226233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226233() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}
