package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103215.
 * @author Sean A. Irvine
 */
public class A103215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103215() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 5, 10, 13, 17, 25});
  }
}
