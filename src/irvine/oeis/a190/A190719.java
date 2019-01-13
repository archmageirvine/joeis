package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190719.
 * @author Sean A. Irvine
 */
public class A190719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190719() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 8, 11, 12});
  }
}
