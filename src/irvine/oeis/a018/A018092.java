package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018092.
 * @author Sean A. Irvine
 */
public class A018092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018092() {
    super(new long[] {324, -171, 24}, new long[] {1, 24, 405});
  }
}
