package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200166.
 * @author Sean A. Irvine
 */
public class A200166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200166() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {2, 34, 128, 348, 726});
  }
}
