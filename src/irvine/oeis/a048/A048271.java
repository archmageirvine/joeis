package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048271.
 * @author Sean A. Irvine
 */
public class A048271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048271() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 8, 9, 6, 4, 10});
  }
}
