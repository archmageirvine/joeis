package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142705.
 * @author Sean A. Irvine
 */
public class A142705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142705() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 2, 15, 6, 35});
  }
}
