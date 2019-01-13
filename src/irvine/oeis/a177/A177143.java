package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177143.
 * @author Sean A. Irvine
 */
public class A177143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177143() {
    super(new long[] {-2, -1, 3, 1}, new long[] {1, 3, 5, 12});
  }
}
