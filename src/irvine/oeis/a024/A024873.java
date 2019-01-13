package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024873.
 * @author Sean A. Irvine
 */
public class A024873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024873() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {6, 8, 26, 43, 97, 156, 308, 499, 915, 1480});
  }
}
