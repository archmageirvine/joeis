package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274830.
 * @author Sean A. Irvine
 */
public class A274830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274830() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 11, 17});
  }
}
