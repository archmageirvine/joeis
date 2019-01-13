package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193399.
 * @author Sean A. Irvine
 */
public class A193399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193399() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {27, 109, 271, 545, 931, 1493});
  }
}
