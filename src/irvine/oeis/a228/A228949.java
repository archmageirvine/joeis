package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228949.
 * @author Sean A. Irvine
 */
public class A228949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228949() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {4, 3, 7, 13, 6, 13});
  }
}
