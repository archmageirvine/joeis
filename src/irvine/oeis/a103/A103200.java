package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103200.
 * @author Sean A. Irvine
 */
public class A103200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103200() {
    super(new long[] {1, -1, -8, 8, 1}, new long[] {1, 2, 11, 19, 90});
  }
}
