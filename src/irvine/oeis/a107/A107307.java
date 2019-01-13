package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107307.
 * @author Sean A. Irvine
 */
public class A107307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107307() {
    super(new long[] {-6, 16, -11, -3, 5}, new long[] {1, 4, 15, 51, 183});
  }
}
