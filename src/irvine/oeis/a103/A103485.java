package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103485.
 * @author Sean A. Irvine
 */
public class A103485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103485() {
    super(new long[] {-1, 0, 1, 1}, new long[] {7, 11, 13, 17});
  }
}
