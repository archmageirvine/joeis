package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003485.
 * @author Sean A. Irvine
 */
public class A003485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003485() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 4, 8, 9});
  }
}

