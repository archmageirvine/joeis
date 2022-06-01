package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062786 Centered 10-gonal numbers.
 * @author Sean A. Irvine
 */
public class A062786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062786() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 31});
  }
}
