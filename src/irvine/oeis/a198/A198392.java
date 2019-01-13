package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198392.
 * @author Sean A. Irvine
 */
public class A198392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198392() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 12, 18, 31});
  }
}
