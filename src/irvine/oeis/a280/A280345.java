package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280345.
 * @author Sean A. Irvine
 */
public class A280345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280345() {
    super(new long[] {-2, 1, 2}, new long[] {3, 7, 12});
  }
}
