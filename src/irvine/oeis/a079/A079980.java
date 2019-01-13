package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079980.
 * @author Sean A. Irvine
 */
public class A079980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079980() {
    super(new long[] {1, 0, 1, -2, 2, 2, 4, 1, 0}, new long[] {1, 0, 1, 2, 3, 8, 12, 27, 52});
  }
}
