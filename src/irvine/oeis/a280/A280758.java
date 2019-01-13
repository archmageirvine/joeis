package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280758.
 * @author Sean A. Irvine
 */
public class A280758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280758() {
    super(new long[] {-1, 1, 3, 1}, new long[] {1, 2, 6, 13});
  }
}
