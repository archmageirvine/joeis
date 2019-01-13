package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119412.
 * @author Sean A. Irvine
 */
public class A119412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119412() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 26});
  }
}
