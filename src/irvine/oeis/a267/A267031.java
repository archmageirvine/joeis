package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267031.
 * @author Sean A. Irvine
 */
public class A267031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267031() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 84, 286});
  }
}
