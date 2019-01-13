package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238832.
 * @author Sean A. Irvine
 */
public class A238832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238832() {
    super(new long[] {-1, 1, 6, 6, -1, -7, -1, 5, 1}, new long[] {0, 0, 1, 1, 4, 9, 23, 58, 141});
  }
}
