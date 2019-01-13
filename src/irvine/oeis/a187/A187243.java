package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187243.
 * @author Sean A. Irvine
 */
public class A187243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187243() {
    super(new long[] {1, -1, 0, 0, 0, -1, 1, 0, 0, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6});
  }
}
