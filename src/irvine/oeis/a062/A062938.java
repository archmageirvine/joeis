package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062938.
 * @author Sean A. Irvine
 */
public class A062938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062938() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 25, 121, 361, 841});
  }
}
