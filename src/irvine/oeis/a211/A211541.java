package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211541.
 * @author Sean A. Irvine
 */
public class A211541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211541() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {0, 0, 1, 1, 3, 3, 6, 7, 11});
  }
}
