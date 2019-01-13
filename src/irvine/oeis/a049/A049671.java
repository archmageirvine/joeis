package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049671.
 * @author Sean A. Irvine
 */
public class A049671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049671() {
    super(new long[] {1, -6, -7, 8}, new long[] {0, 2, 11, 73});
  }
}
