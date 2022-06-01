package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196289 n^9 - n.
 * @author Sean A. Irvine
 */
public class A196289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196289() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 0, 510, 19680, 262140, 1953120, 10077690, 40353600, 134217720, 387420480});
  }
}
