package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101883 Write four numbers, skip one, write four, skip two, write four, skip three... and so on.
 * @author Sean A. Irvine
 */
public class A101883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101883() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {1, 2, 3, 4, 6, 7, 8, 9, 12});
  }
}
