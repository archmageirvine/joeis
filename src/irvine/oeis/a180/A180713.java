package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180713.
 * @author Sean A. Irvine
 */
public class A180713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180713() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 6, 11, 12});
  }
}
