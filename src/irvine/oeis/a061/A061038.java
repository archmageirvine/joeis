package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061038.
 * @author Sean A. Irvine
 */
public class A061038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061038() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 36, 16, 100, 9, 196, 64, 324, 25, 484, 144, 676});
  }
}
