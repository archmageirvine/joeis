package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290905.
 * @author Sean A. Irvine
 */
public class A290905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290905() {
    super(new long[] {-1, 4, -4, 4}, new long[] {0, 1, 4, 12});
  }
}
