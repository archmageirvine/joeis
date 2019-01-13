package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060884.
 * @author Sean A. Irvine
 */
public class A060884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060884() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 11, 61, 205});
  }
}
