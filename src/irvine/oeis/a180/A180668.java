package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180668.
 * @author Sean A. Irvine
 */
public class A180668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180668() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {0, 0, 1, 5, 14});
  }
}
