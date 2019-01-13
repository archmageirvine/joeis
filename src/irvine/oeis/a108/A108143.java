package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108143.
 * @author Sean A. Irvine
 */
public class A108143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108143() {
    super(new long[] {-1, -1, 5}, new long[] {1, 1, 1});
  }
}
