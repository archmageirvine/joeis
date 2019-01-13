package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254627.
 * @author Sean A. Irvine
 */
public class A254627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254627() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {1, 2, 11, 28, 189});
  }
}
