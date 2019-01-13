package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027441.
 * @author Sean A. Irvine
 */
public class A027441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027441() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 9, 42, 130});
  }
}
