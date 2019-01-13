package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181635.
 * @author Sean A. Irvine
 */
public class A181635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181635() {
    super(new long[] {-1296, 216, 0, 6}, new long[] {0, 36, 0, 1296});
  }
}
