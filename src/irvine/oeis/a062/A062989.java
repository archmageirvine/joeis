package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062989.
 * @author Sean A. Irvine
 */
public class A062989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062989() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 5, 25, 80, 205, 456, 917});
  }
}
