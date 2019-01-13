package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208674.
 * @author Sean A. Irvine
 */
public class A208674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208674() {
    super(new long[] {4, -2, -14, -1, 5}, new long[] {1, 1, 10, 37, 163});
  }
}
