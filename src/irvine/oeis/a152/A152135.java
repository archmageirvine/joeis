package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152135.
 * @author Sean A. Irvine
 */
public class A152135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152135() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {12, 36, 74, 134, 216});
  }
}
