package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192978.
 * @author Sean A. Irvine
 */
public class A192978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192978() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 4, 12, 29});
  }
}
