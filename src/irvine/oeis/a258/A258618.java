package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258618.
 * @author Sean A. Irvine
 */
public class A258618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258618() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 13, 68, 189});
  }
}
