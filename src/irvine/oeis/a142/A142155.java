package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142155.
 * @author Sean A. Irvine
 */
public class A142155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142155() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 0, 1, -1}, new long[] {1, -1, 2, -3, 6, -9, 17, -27, 48, -80});
  }
}
