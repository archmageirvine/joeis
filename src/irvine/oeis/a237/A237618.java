package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237618.
 * @author Sean A. Irvine
 */
public class A237618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237618() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 22, 82});
  }
}
