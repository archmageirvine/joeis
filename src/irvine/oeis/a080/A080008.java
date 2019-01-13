package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080008.
 * @author Sean A. Irvine
 */
public class A080008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080008() {
    super(new long[] {-1, -1, 0, -1, 0, 2, 2, 1, 1, 0}, new long[] {1, 0, 0, 1, 2, 2, 3, 5, 11, 15});
  }
}
