package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024874.
 * @author Sean A. Irvine
 */
public class A024874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024874() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {4, 6, 19, 31, 70, 113, 223, 361, 662, 1071});
  }
}
