package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192780.
 * @author Sean A. Irvine
 */
public class A192780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192780() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {1, 0, 1, 1, 2, 5});
  }
}
